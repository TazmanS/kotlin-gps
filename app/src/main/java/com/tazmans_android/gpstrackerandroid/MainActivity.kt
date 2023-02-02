package com.tazmans_android.gpstrackerandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tazmans_android.gpstrackerandroid.databinding.ActivityMainBinding
import com.tazmans_android.gpstrackerandroid.fragments.MainFragment
import com.tazmans_android.gpstrackerandroid.fragments.SettingsFragment
import com.tazmans_android.gpstrackerandroid.fragments.TracksFragment
import com.tazmans_android.gpstrackerandroid.utils.openFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onBottomNavClicks()
        openFragment(MainFragment.newInstance())
    }

    private fun onBottomNavClicks() {
        binding.bNan.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.id_home -> openFragment(MainFragment.newInstance())
                R.id.id_tracks -> openFragment(TracksFragment.newInstance())
                R.id.id_settings -> openFragment(SettingsFragment())
            }
            true
        }
    }
}