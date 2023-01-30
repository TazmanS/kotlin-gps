package com.tazmans_android.gpstrackerandroid.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tazmans_android.gpstrackerandroid.R
import com.tazmans_android.gpstrackerandroid.databinding.FragmentMainBinding
import com.tazmans_android.gpstrackerandroid.databinding.ViewTrackBinding

class ViewTrackFragment : Fragment() {
    private lateinit var binding: ViewTrackBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ViewTrackBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = ViewTrackFragment()
    }
}