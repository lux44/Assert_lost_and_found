package com.lux.assert_lost_and_found

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.lux.assert_lost_and_found.databinding.ActivityDetailBinding
import org.w3c.dom.Text
import java.text.SimpleDateFormat
import java.util.*

class DetailActivity : AppCompatActivity() {
    val binding:ActivityDetailBinding by lazy { ActivityDetailBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_detail)
        setContentView(binding.root)

        binding.btnTimePick.setOnClickListener {
            getTime(binding.tvGetTime,context = this)
        }
        binding.btnDatePick.setOnClickListener {
            getDate(binding.tvGetDate,this)
        }
        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
        binding.btnNext.setOnClickListener {
            val intent:Intent= Intent(this,PictureActivity::class.java)
            startActivity(intent)
        }
    }

    fun getDate(tv_getDate:TextView,context: Context){
        val calendar=Calendar.getInstance()

        val dateSetListener=DatePickerDialog.OnDateSetListener{
            datePicker, year, month, day ->
            calendar.set(Calendar.YEAR,year)
            calendar.set(Calendar.MONTH,month)
            calendar.set(Calendar.DAY_OF_MONTH,day)

            tv_getDate.text=SimpleDateFormat("yyyy/MM/dd").format(calendar.time)
        }

        DatePickerDialog(context,dateSetListener,calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show()
    }

    fun getTime(tv_getTime:TextView,context: Context){
        val calendar=Calendar.getInstance()

        val timeSetListener=TimePickerDialog.OnTimeSetListener{
            timePicker, hour, minute ->
            calendar.set(Calendar.HOUR_OF_DAY,hour)
            calendar.set(Calendar.MINUTE,minute)

            tv_getTime.text=SimpleDateFormat("HH:mm").format(calendar.time)
        }

        TimePickerDialog(context,timeSetListener,calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE),true).show()
    }




}