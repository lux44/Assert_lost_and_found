package com.lux.assert_lost_and_found

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lux.assert_lost_and_found.databinding.ActivityEditProductLocationBinding

class EditProductLocationActivity : AppCompatActivity() {
    val binding:ActivityEditProductLocationBinding by lazy { ActivityEditProductLocationBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_edit_product_location)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener { onBackPressed() }
        binding.btnNext.setOnClickListener {
            val intent:Intent=Intent(this,DetailExplainActivity::class.java)
            startActivity(intent)
        }
    }
}