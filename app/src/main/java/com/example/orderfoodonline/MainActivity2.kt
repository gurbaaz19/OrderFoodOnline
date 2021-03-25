package com.example.orderfoodonline

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity2 : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

                val abt1= findViewById<Button>(R.id.btApIt1)

//        var placedOrder = mutableListOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
//
            abt1.setOnClickListener{
            Log.d("Hey","Log Message")
            }

        val apFragment = ApFragment()
        val mcFragment = McFragment()
        val dsFragment = DsFragment()
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        setCurrentFragment(apFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.miap -> setCurrentFragment(apFragment)
                R.id.mimc -> setCurrentFragment(mcFragment)
                R.id.mids -> setCurrentFragment(dsFragment)
            }
            true
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.miorder -> Intent(applicationContext, MainActivity3::class.java).also {
                startActivity(it)
            }
        }
        return true
    }

    private fun setCurrentFragment(fragment: Fragment) =
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, fragment)
                commit()
            }
}