package com.example.orderfoodonline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.internal.NavigationMenuItemView

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btApIt1= findViewById<Button>(R.id.btApIt1)
        val btApIt2= findViewById<Button>(R.id.btApIt2)
        val btApIt3= findViewById<Button>(R.id.btApIt3)
        val btApIt4= findViewById<Button>(R.id.btApIt4)
        val btMcIt1= findViewById<Button>(R.id.btMcIt1)
        val btMcIt2= findViewById<Button>(R.id.btMcIt2)
        val btMcIt3= findViewById<Button>(R.id.btMcIt3)
        val btMcIt4= findViewById<Button>(R.id.btMcIt4)
        val btDsIt1= findViewById<Button>(R.id.btDsIt1)
        val btDsIt2= findViewById<Button>(R.id.btDsIt2)
        val btDsIt3= findViewById<Button>(R.id.btDsIt3)
        val btDsIt4= findViewById<Button>(R.id.btDsIt4)



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
        when(item.itemId){
            R.id.miorder -> Intent(applicationContext, MainActivity3::class.java).also{
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