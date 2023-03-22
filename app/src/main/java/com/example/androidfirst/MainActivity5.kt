package com.example.androidfirst

import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.example.androidfirst.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {
    lateinit var binding: ActivityMain5Binding
    var pauseTime = 0L
    var initTime = 0L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                binding.tvMessage.text = getString(R.string.btn_Start)
                binding.tvMessage.textSize = resources.getDimension(R.dimen.txt_size_large)
                binding.tvMessage.setTextColor(ResourcesCompat.getColor(resources, R.color.txt_color2, null))
                binding.chronometer.base = SystemClock.elapsedRealtime() + pauseTime
                binding.chronometer.start()
                binding.btnStart.isEnabled = false
                binding.btnStop.isEnabled = true
                binding.btnReset.isEnabled = true
            }
        })
        binding.btnStop.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                pauseTime = binding.chronometer.base - SystemClock.elapsedRealtime()
                binding.chronometer.stop()
                binding.tvMessage.textSize = resources.getDimension(R.dimen.txt_size_small)
                binding.tvMessage.setTextColor(ResourcesCompat.getColor(resources, R.color.txt_color, null))
                binding.tvMessage.text = getString(R.string.btn_Stop)
                binding.btnStart.isEnabled = true
                binding.btnStop.isEnabled = false
                binding.btnReset.isEnabled = true
            }
        })
        binding.btnReset.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                binding.chronometer.base = SystemClock.elapsedRealtime()
                binding.chronometer.stop()
                binding.tvMessage.textSize = resources.getDimension(R.dimen.txt_size_medium)
                pauseTime = 0L
                binding.tvMessage.text = getString(R.string.btn_Reset)
                binding.btnStart.isEnabled = true
                binding.btnStop.isEnabled = false
                binding.btnReset.isEnabled = false
            }
        })
    }

    //백버튼을 가져올려고 한다. (볼륨조절, 전원, 백버튼)
//    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
//        if (keyCode == KeyEvent.KEYCODE_BACK) {
//            if (System.currentTimeMillis() - initTime > 3000) {
//                Toast.makeText(this@MainActivity5, "3초이내 한번 더 눌러줘", Toast.LENGTH_SHORT).show()
//                initTime = System.currentTimeMillis()
//                //조건에 안맞아서 작동 안시킴
//                return true
//            }
//        }
//        //진짜 백버튼 기능 수행
//        return super.onKeyDown(keyCode, event)
//    }

    override fun onBackPressed() {
        if (System.currentTimeMillis() - initTime > 3000) {
            binding.tvMessage.text = getString(R.string.btn_back)
            Toast.makeText(this@MainActivity5, getString(R.string.btn_back), Toast.LENGTH_SHORT)
                .show()
            initTime = System.currentTimeMillis()
        } else {
            super.onBackPressed()
        }
    }
}