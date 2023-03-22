package com.example.androidfirst

import android.os.Build
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import android.view.WindowMetrics
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfirst.databinding.ActivityMain7Binding

class MainActivity7 : AppCompatActivity() {
    lateinit var binding: ActivityMain7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //화면정보를 가져오는데 버전에 따라서 명령이 다르다. API 30 버전
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            val windowMetrics: WindowMetrics = windowManager.currentWindowMetrics
            Log.e("MainActivity7", "30이상 width : ${windowMetrics.bounds.width()}" + "height : ${windowMetrics.bounds.height()}")
        } else{
            val display = windowManager.defaultDisplay
            val displayMetrics = DisplayMetrics()
            display?.getRealMetrics(displayMetrics)
            Log.e("MainActivity7", "30미만 width : ${displayMetrics.widthPixels}" + "height : ${displayMetrics.heightPixels}")
        }
    }
}