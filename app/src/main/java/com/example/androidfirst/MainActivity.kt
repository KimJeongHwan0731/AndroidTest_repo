package com.example.androidfirst

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfirst.databinding.ActivitySub23Binding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivitySub23Binding
    var flag: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySub23Binding.inflate(layoutInflater)

        setContentView(binding.root)
        //버튼1 선택 시, 화면1 노출 및 버튼2 선택 시, 화면 2 노출 로직
        binding.btnSelectOne.setOnClickListener {
            if (flag == true) {
                binding.screenOne.visibility = View.VISIBLE
                binding.screenTwo.visibility = View.INVISIBLE
                flag = false
            } else {
                binding.screenOne.visibility = View.INVISIBLE
                binding.screenTwo.visibility = View.VISIBLE
                flag = true
            }
        }

        //프레임레이아웃 -> 리니어레이아웃 1번화면
        binding.imgPictuerOne.setOnClickListener {
            Toast.makeText(this, "1번화면입니다.", Toast.LENGTH_SHORT).show()
        }
        //프레임레이아웃 -> 리니어레이아웃 2번화면
        binding.imgPictuerTwo.setOnClickListener {
            Toast.makeText(this, "2번화면입니다.", Toast.LENGTH_SHORT).show()
        }
    }
}

