package com.example.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class BlankFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("TAGLifeCycle", "onCreate")


        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d("TAGLifeCycle", "onCreateView")
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("TAGLifeCycle", "onViewCreated")

        view.findViewById<Button>(R.id.button).setOnClickListener(){
            findNavController().navigate(R.id.action_blankFragment_to_secondFragment)
        }
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("TAGLifeCycle", "onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAGLifeCycle", "onStart")
    }


    override fun onResume() {
        super.onResume()
        Log.d("TAGLifeCycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAGLifeCycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAGLifeCycle", "onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("TAGLifeCycle", "onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("TAGLifeCycle", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAGLifeCycle", "onDestroy")
    }

    }

