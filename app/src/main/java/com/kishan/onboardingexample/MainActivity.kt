package com.kishan.onboardingexample

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import androidx.viewpager2.widget.ViewPager2
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator

class MainActivity : AppCompatActivity() {
    lateinit var relativeLayout: RelativeLayout
    lateinit var animationDrawable : AnimationDrawable
    lateinit var viewPager:ViewPager2
    lateinit var viewPager2Adapter: ViewPager2Adapter
    lateinit var dotsIndicator : DotsIndicator
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        relativeLayout = findViewById(R.id.layout_1)
        dotsIndicator = findViewById(R.id.dots_indicator)
        animationDrawable = relativeLayout.background as AnimationDrawable
        setAnimation(animationDrawable)

        viewPager = findViewById(R.id.vP)
        viewPager2Adapter = ViewPager2Adapter(this)
        viewPager.adapter = viewPager2Adapter
        dotsIndicator.attachTo(viewPager)
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int,
            ) {

            }

            override fun onPageSelected(position: Int) {
//                Log.i("page", position.toString())

                when (position) {
                    0 -> {
                        relativeLayout.setBackgroundResource(R.drawable.gradient_animate)
                        val animationDrawable = relativeLayout.background as AnimationDrawable
                        setAnimation(animationDrawable)
                    }
                    1-> {
                        relativeLayout.setBackgroundResource(R.drawable.gradient_animate2)
                        val animationDrawable = relativeLayout.background as AnimationDrawable
                        setAnimation(animationDrawable)
                    }
                    2 -> {
                        relativeLayout.setBackgroundResource(R.drawable.gradient_animate3)
                        val animationDrawable = relativeLayout.background as AnimationDrawable
                        setAnimation(animationDrawable)
                    }
                    3 -> {
                        relativeLayout.setBackgroundResource(R.drawable.gradient_animate4)
                        val animationDrawable = relativeLayout.background as AnimationDrawable
                        setAnimation(animationDrawable)
                    }
                }
            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })

    }

    private fun setAnimation(animationDrawable: AnimationDrawable) {
        animationDrawable.setEnterFadeDuration(2000)
        animationDrawable.setExitFadeDuration(1000)
        animationDrawable.start()
    }
}