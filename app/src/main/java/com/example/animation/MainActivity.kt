package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.example.animation.databinding.ActivityMainBinding

//animationlarning turlari juda kop
//alpha and translate and scale and rotate and combination animation lar
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //bu yer hamma anim uchun bi xil boladi listeneri ham chaqirilishiham
        // qaysi anim ishlatmoqchi bolsang faqat val anim = AnimationUtils.loadAnimation(this, R.anim.my_alpha) shu
        //yerdagi my_alpha ni orniga boshqa anim nomini yozib qoysang boldi
        val anim = AnimationUtils.loadAnimation(this, R.anim.my_alpha)
        binding.image.setOnClickListener {
            binding.image.startAnimation(anim)
        }
        anim.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
                Toast.makeText(this@MainActivity, "animatsiya boshlandi", Toast.LENGTH_SHORT).show()
            }

            override fun onAnimationEnd(animation: Animation?) {
                Toast.makeText(this@MainActivity, "animatsiya tugadi", Toast.LENGTH_SHORT).show()
            }

            override fun onAnimationRepeat(animation: Animation?) {
                TODO("Not yet implemented")
            }
        })

    }
}