package com.example.orderfoodonline

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Cart: AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cart)
            findViewById<Button>(R.id.btnReset).setOnClickListener {
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

                finish()
            }
            var todolist = mutableListOf(
                Rvhold(uqtyap[0]), Rvhold(uqtyap[1]), Rvhold(uqtyap[2]), Rvhold(uqtyap[3]),
                Rvhold(uqtymc[0]), Rvhold(uqtymc[1]), Rvhold(uqtymc[2]), Rvhold(uqtymc[3]),
                Rvhold(uqtyds[0]), Rvhold(uqtyds[1]), Rvhold(uqtyds[2]), Rvhold(uqtyds[3])
            )

            var totalCost = cost[0]*uqtyap[0]+cost[1]*uqtyap[1]+cost[2]*uqtyap[2]+cost[3]*uqtyap[3]+cost[4]*uqtymc[0]+cost[5]*uqtymc[1]+cost[6]*uqtymc[2]+cost[7]*uqtymc[3]+cost[8]*uqtyds[0]+cost[9]*uqtyds[1]+cost[10]*uqtyds[2]+cost[11]*uqtyds[3]
            var gst = 0.18*totalCost
            var netAmt = gst + totalCost
        findViewById<TextView>(R.id.tvTotal).text= totalCost.toString()
        findViewById<TextView>(R.id.tvGST).text= gst.toString()
        findViewById<TextView>(R.id.tvTotalGST).text= netAmt.toString()


        val adapter = ToDoAdapter(todolist)
        findViewById<RecyclerView>(R.id.rvcart).adapter = adapter
        findViewById<RecyclerView>(R.id.rvcart).layoutManager = LinearLayoutManager(this)
    }
    // Remove this if needed
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.mimenu -> finish()
        }
        return true
    }
}