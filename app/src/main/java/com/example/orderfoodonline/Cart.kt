package com.example.orderfoodonline

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Cart: AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cart)



            var todolist = mutableListOf(
                Rvhold(uqtyap[0]), Rvhold(uqtyap[1]), Rvhold(uqtyap[2]), Rvhold(uqtyap[3]),
                Rvhold(uqtymc[0]), Rvhold(uqtymc[1]), Rvhold(uqtymc[2]), Rvhold(uqtymc[3]),
                Rvhold(uqtyds[0]), Rvhold(uqtyds[1]), Rvhold(uqtyds[2]), Rvhold(uqtyds[3])
            )


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