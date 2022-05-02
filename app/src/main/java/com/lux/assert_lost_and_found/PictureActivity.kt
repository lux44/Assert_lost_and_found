package com.lux.assert_lost_and_found

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lux.assert_lost_and_found.databinding.ActivityPictureBinding

class PictureActivity : AppCompatActivity() {

    val binding:ActivityPictureBinding by lazy { ActivityPictureBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_picture)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
        binding.btnNext.setOnClickListener {
            val intent:Intent= Intent(this,ProductLocationActivity::class.java)
            startActivity(intent)
        }
    }
}