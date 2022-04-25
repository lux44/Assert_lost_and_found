package com.lux.assert_lost_and_found

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.lux.assert_lost_and_found.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding:ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    val btn_get:Button by lazy { binding.btnGet }
    val btn_lost:Button by lazy { binding.btnLost }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)


    }
}