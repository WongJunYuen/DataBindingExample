package com.example.setdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil.setContentView
import com.example.setdata.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        var student:Student=Student ("Ali","RSD")

        binding = setContentView(this,R.layout.activity_main)
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding.BtnSetData.setOnClickListener(){


            binding.myStudent=student
            //binding.TvName.text = "Ali"
            //binding.TvProgramme.text = "RSD"
        }

        binding.btnChange.setOnClickListener(){
            student.programme="RSF"
            binding.invalidateAll()
        }
    }
}