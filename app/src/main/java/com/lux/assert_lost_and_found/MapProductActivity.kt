package com.lux.assert_lost_and_found

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lux.assert_lost_and_found.databinding.ActivityMapProductBinding

class MapProductActivity : AppCompatActivity() {

//    val binding:ActivityMapProductBinding by lazy { ActivityMapProductBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map_product)
//        setContentView(binding.root)
//
//        binding.btnBack.setOnClickListener {
//            onBackPressed()
//        }
//        binding.btnNext.setOnClickListener {
//            val intent:Intent= Intent(this,DetailExplainActivity::class.java)
//            startActivity(intent)
//        }
    }
}