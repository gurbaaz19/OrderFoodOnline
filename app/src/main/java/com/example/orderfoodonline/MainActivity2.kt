package com.example.orderfoodonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val apFragment = ApFragment()
        val mcFragment = McFragment()
        val dsFragment = DsFragment()
        val bottomNavigationView= findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        setCurrentFragment(apFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.miap -> setCurrentFragment(apFragment)
                R.id.mimc -> setCurrentFragment(mcFragment)
                R.id.mids -> setCurrentFragment(dsFragment)
            }
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            commit()
        }
}