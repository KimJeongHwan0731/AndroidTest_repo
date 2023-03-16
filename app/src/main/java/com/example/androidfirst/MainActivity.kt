package com.example.androidfirst

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.InputType
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfirst.databinding.*

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivitySub4Binding
    lateinit var binding2: ActivitySub11Binding
    lateinit var binding3: ActivitySub13Binding
    lateinit var binding4: ActivitySub15Binding
    lateinit var binding5: ActivitySub16Binding
    var flag: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySub4Binding.inflate(layoutInflater)
        binding2 = ActivitySub11Binding.inflate(layoutInflater)
        binding3 = ActivitySub13Binding.inflate(layoutInflater)
        binding4 = ActivitySub15Binding.inflate(layoutInflater)
        binding5 = ActivitySub16Binding.inflate(layoutInflater)
        setContentView(binding5.root)

//        binding3.btnClick.setOnClickListener {
//            if(flag == true) {
//                binding3.btnTarget.visibility = View.VISIBLE
//                binding3.btnGone.visibility = View.VISIBLE
//                flag = false
//            } else {
//                binding3.btnTarget.visibility = View.INVISIBLE
//                binding3.btnGone.visibility = View.GONE
//                flag = true
//            }
//
//        binding4.button13.setOnClickListener {
//            if(flag == true) {
//                binding4.checkBox.isChecked = true
//                binding4.checkBox2.isChecked = true
//                flag = false
//            } else {
//                binding4.checkBox.isChecked = false
//                binding4.checkBox2.isChecked = false
//                flag = true
//            }
//        }

        binding5.edtPassword.setOnLongClickListener {
            binding5.edtPassword.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            Toast.makeText(applicationContext,binding5.edtPassword.text.toString(),Toast.LENGTH_SHORT).show()
            Handler(Looper.getMainLooper()).postDelayed({
            }, 2000)
            binding5.edtPassword.inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD
            return@setOnLongClickListener(true)
        }
//        binding5.edtPassword.setOnClickListener{
//            binding5.edtPassword.inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD
//        }
    }
}
