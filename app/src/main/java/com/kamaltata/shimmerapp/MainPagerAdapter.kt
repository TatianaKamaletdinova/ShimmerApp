package com.kamaltata.shimmerapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.kamaltata.shimmerapp.firstfragment.FirstFragment
import com.kamaltata.shimmerapp.secondfragment.SecondFragment
import com.kamaltata.shimmerapp.tgreefragment.ThreeFragment

class MainPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> FirstFragment()
            1 -> SecondFragment()
            else -> ThreeFragment()
        }
    }
}