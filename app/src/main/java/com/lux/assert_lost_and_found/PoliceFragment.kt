package com.lux.assert_lost_and_found

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.lux.assert_lost_and_found.databinding.FragmentPoliceBinding

class PoliceFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    val binding:FragmentPoliceBinding by lazy { FragmentPoliceBinding.inflate(layoutInflater) }
    val recycler:RecyclerView by lazy { binding.recyclerPolice }


}