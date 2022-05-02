package com.lux.assert_lost_and_found

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.isInvisible
import com.lux.assert_lost_and_found.databinding.ActivityWhatBinding

class WhatActivity : AppCompatActivity() {

    val binding:ActivityWhatBinding by lazy { ActivityWhatBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_what)
        setContentView(binding.root)

        binding.spinnerCategory1.adapter=ArrayAdapter.createFromResource(this,R.array.category1,R.layout.spinner_sample)
        (binding.spinnerCategory1.adapter as ArrayAdapter<CharSequence>).setDropDownViewResource(R.layout.spinner_sample)
         binding.spinnerCategory1.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                when(binding.spinnerCategory1.selectedItemPosition){
                    0->{
                        binding.spinnerCategory2.visibility=View.VISIBLE
                        binding.spinnerCategory2.adapter=ArrayAdapter.createFromResource(this@WhatActivity,R.array.category2_1,R.layout.spinner_sample)
                        (binding.spinnerCategory2.adapter as ArrayAdapter<CharSequence>).setDropDownViewResource(R.layout.spinner_sample)
                    }
                    6->{
                        binding.spinnerCategory2.visibility=View.VISIBLE
                        binding.spinnerCategory2.adapter=ArrayAdapter.createFromResource(this@WhatActivity,R.array.category2_2,R.layout.spinner_sample)
                        (binding.spinnerCategory2.adapter as ArrayAdapter<CharSequence>).setDropDownViewResource(R.layout.spinner_sample)
                    }
                    else ->{
                        binding.spinnerCategory2.visibility=View.INVISIBLE
                    }
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
        binding.btnNext.setOnClickListener {
            val intent:Intent= Intent(this ,DetailActivity::class.java)
            startActivity(intent)
        }
    }
}