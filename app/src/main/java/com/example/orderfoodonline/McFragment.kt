package com.example.orderfoodonline

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class McFragment : Fragment(R.layout.fragment_mc) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getView()?.findViewById<Button>(R.id.btMcIt1)?.setOnClickListener {
            Log.d("Hey", "Log Message5")
        }
        getView()?.findViewById<Button>(R.id.btMcIt2)?.setOnClickListener {
            Log.d("Hey", "Log Message6")
        }
        getView()?.findViewById<Button>(R.id.btMcIt3)?.setOnClickListener {
            Log.d("Hey", "Log Message7")
        }
        getView()?.findViewById<Button>(R.id.btMcIt4)?.setOnClickListener {
            Log.d("Hey", "Log Message8")
        }
    }
}
