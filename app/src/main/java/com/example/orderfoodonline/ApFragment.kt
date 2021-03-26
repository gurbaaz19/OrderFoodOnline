package com.example.orderfoodonline

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class ApFragment : Fragment(R.layout.fragment_ap) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getView()?.findViewById<Button>(R.id.btApIt1)?.setOnClickListener {
            Log.d("Hey", "Log Message1")
        }
        getView()?.findViewById<Button>(R.id.btApIt2)?.setOnClickListener {
            Log.d("Hey", "Log Message2")
        }
        getView()?.findViewById<Button>(R.id.btApIt3)?.setOnClickListener {
            Log.d("Hey", "Log Message3")
        }
        getView()?.findViewById<Button>(R.id.btApIt4)?.setOnClickListener {
            Log.d("Hey", "Log Message4")
        }
    }
}
