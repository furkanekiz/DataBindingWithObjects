package com.furkanekiz.databindingwithobjects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.furkanekiz.databindingwithobjects.databinding.AcMainBinding

class ACMain : AppCompatActivity() {

    private lateinit var binding: AcMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.ac_main)

        binding.student = getStudent()

        /*val student = getStudent()
        binding.nameText.text = student.name
        binding.emailText.text = student.email*/
    }

    private fun getStudent(): Student {
        return Student(1, "Alex", "alex@gmail.com")
    }
}