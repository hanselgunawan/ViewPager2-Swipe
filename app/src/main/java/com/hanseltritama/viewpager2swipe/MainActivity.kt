package com.hanseltritama.viewpager2swipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        view_pager.adapter = ViewPagerAdapter(this)

        TabLayoutMediator(tab_dots, view_pager, TabLayoutMediator.TabConfigurationStrategy { tab, position ->

        }).attach()

        view_pager.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                Snackbar.make(parent_view, "You are selected ${position + 1}", Snackbar.LENGTH_SHORT).show()
            }
        })

    }
}
