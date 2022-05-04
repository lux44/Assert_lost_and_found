package com.lux.assert_lost_and_found

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.lux.assert_lost_and_found.databinding.FragmentMapBinding

class MapFragment : Fragment() {

    val binding:FragmentMapBinding by lazy { FragmentMapBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentManager:FragmentManager= childFragmentManager
        val mapFragmnet:SupportMapFragment= fragmentManager.findFragmentById(R.id.fragment_map) as SupportMapFragment

        mapFragmnet.getMapAsync {
            val seoul:LatLng= LatLng(37.5609, 127.0347)
            it.moveCamera(CameraUpdateFactory.newLatLngZoom(seoul, 16F))

            val markerOption:MarkerOptions=MarkerOptions().position(seoul)
            it.addMarker(markerOption)

        }
    }
}