package com.navgraph.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.navgraph.R
import kotlinx.android.synthetic.main.fragment_photos.*

class photosFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_photos, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_home.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.next_action)
        }

        arguments.let {
            val safeArgs = photosFragmentArgs.fromBundle(it)
            tv_number.text = "Number of photos : ${safeArgs.numOfPhotos}"
        }
    }
}
