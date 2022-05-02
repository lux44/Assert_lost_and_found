package com.lux.assert_lost_and_found

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lux.assert_lost_and_found.databinding.ActivityProductLocationBinding

class ProductLocationActivity : AppCompatActivity() {
    val binding:ActivityProductLocationBinding by lazy { ActivityProductLocationBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_product_location)
        setContentView(binding.root)

        binding.btnEditLocation.setOnClickListener {
            val dialog:ProductLocationDialog= ProductLocationDialog(this)
            dialog.plDialog()
        }
        binding.btnMine.setOnClickListener {

        }
    }
}