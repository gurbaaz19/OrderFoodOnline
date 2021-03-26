package com.example.orderfoodonline

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class DsFragment : Fragment(R.layout.fragment_ds) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getView()?.findViewById<Button>(R.id.btDsIt1)?.setOnClickListener {
            Log.d("Hey", "Log Message9")
        }
        getView()?.findViewById<Button>(R.id.btDsIt2)?.setOnClickListener {
            Log.d("Hey", "Log Message10")
        }
        getView()?.findViewById<Button>(R.id.btDsIt3)?.setOnClickListener {
            Log.d("Hey", "Log Message11")
        }
        getView()?.findViewById<Button>(R.id.btDsIt4)?.setOnClickListener {
            Log.d("Hey", "Log Message12")
        }
    }
}
