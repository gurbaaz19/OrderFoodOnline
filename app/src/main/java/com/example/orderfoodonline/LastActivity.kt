package com.example.orderfoodonline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last)

        findViewById<Button>(R.id.btBack).setOnClickListener{
            uqtyap[0]=0
            uqtyap[1]=0
            uqtyap[2]=0
            uqtyap[3]=0
            uqtymc[0]=0
            uqtymc[1]=0
            uqtymc[2]=0
            uqtymc[3]=0
            uqtyds[0]=0
            uqtyds[1]=0
            uqtyds[2]=0
            uqtyds[3]=0

            finishAffinity()
        }
    }
}