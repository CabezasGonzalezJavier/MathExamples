package com.thedeveloperworldisyours.mathexamples.most

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.design.widget.Snackbar
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.view.Menu
import android.view.MenuItem
import com.thedeveloperworldisyours.mathexamples.ActivityUtils
import com.thedeveloperworldisyours.mathexamples.R
import com.thedeveloperworldisyours.mathexamples.fibonacci.FibonacciActivity
import kotlinx.android.synthetic.main.most_app_bar.*
import kotlinx.android.synthetic.main.most_repeated_activity.*


class MostRepeatedActivity : AppCompatActivity() , NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.most_repeated_activity)

        setSupportActionBar(most_app_bar_toolbar)

        most_app_bar_fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val toggle = ActionBarDrawerToggle(this, most_drawer_layout, most_app_bar_toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)

        most_drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        val navigationView = findViewById(R.id.most_nav_view) as NavigationView
        navigationView.setNavigationItemSelectedListener(this)

        var mostFragment: MostFragment? = supportFragmentManager.findFragmentById(R.id.most_content) as? MostFragment
        if (mostFragment == null) {
            mostFragment = MostFragment.Companion.newInstance()
            ActivityUtils.addFragmentToActivity(supportFragmentManager, mostFragment, R.id.most_content)
        }

    }

    override fun onBackPressed() {
        val drawer = findViewById(R.id.most_drawer_layout) as DrawerLayout
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_fibonacci -> {
                val intent = Intent(this@MostRepeatedActivity, FibonacciActivity::class.java)
                startActivity(intent)
            }
            R.id.nav_most_repeated -> {

            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_manage -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }

        val drawer = findViewById(R.id.most_drawer_layout) as DrawerLayout
        drawer.closeDrawer(GravityCompat.START)
        return true
    }
}
