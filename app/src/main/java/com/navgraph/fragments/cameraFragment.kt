package com.navgraph.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavAction
import androidx.navigation.Navigation

import com.navgraph.R
import kotlinx.android.synthetic.main.fragment_camera.*
import kotlin.random.Random

class cameraFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_camera, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_photos.setOnClickListener {
            val random = java.util.Random()

            val nextAction = cameraFragmentDirections.nextAction()
            nextAction.setNumOfPhotos(random.nextInt(100))

            Navigation.findNavController(it).navigate(nextAction)
        }
    }
}
