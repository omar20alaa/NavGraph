package com.navgraph

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = Navigation.findNavController(this , R.id.nav_host_fragment)

        initNavComponent()
        setupBottomNavigation(navController)
    }


    private fun initNavComponent() {

        setSupportActionBar(toolbar)


    } // initialize navigation controller


    private fun setupBottomNavigation(navController : NavController) {

        bottom_nav?.let {
            NavigationUI.setupWithNavController(it , navController)
            NavigationUI.setupActionBarWithNavController(this , navController)
        }

    } // set bottom navigation view

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar , menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        val navController = Navigation.findNavController(this , R.id.nav_host_fragment)
        val navigated = NavigationUI.onNavDestinationSelected(item!! , navController)
        return navigated || super.onOptionsItemSelected(item)

    }
}
