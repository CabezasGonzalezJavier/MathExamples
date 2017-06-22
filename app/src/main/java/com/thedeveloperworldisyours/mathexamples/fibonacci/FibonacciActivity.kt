package com.thedeveloperworldisyours.mathexamples.fibonacci

import com.thedeveloperworldisyours.mathexamples.most.MostRepeatedActivity
import com.thedeveloperworldisyours.mathexamples.R

import kotlinx.android.synthetic.main.fibonacci_app_bar.*

class FibonacciActivity : android.support.v7.app.AppCompatActivity(), android.support.design.widget.NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.thedeveloperworldisyours.mathexamples.R.layout.fibonacci_activity)
        setSupportActionBar(fibonacci_toolbar)

        fibonacci_fab.setOnClickListener { view ->
            android.support.design.widget.Snackbar.make(view, "Replace with your own action", android.support.design.widget.Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val drawer = findViewById(com.thedeveloperworldisyours.mathexamples.R.id.fibonacci_drawer_layout) as android.support.v4.widget.DrawerLayout
        val toggle = android.support.v7.app.ActionBarDrawerToggle(
                this, drawer, fibonacci_toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer.addDrawerListener(toggle)
        toggle.syncState()

        val navigationView = findViewById(com.thedeveloperworldisyours.mathexamples.R.id.fibonacci_nav_view) as android.support.design.widget.NavigationView
        navigationView.setNavigationItemSelectedListener(this)


        var fibonacciFragment: FibonacciFragment? = supportFragmentManager.findFragmentById(com.thedeveloperworldisyours.mathexamples.R.id.fibonacci_content) as? FibonacciFragment
        if (fibonacciFragment == null) {
            // Create the fragment
            fibonacciFragment = FibonacciFragment.newInstance()
            com.thedeveloperworldisyours.mathexamples.ActivityUtils.Companion.addFragmentToActivity(
                    supportFragmentManager, fibonacciFragment, R.id.fibonacci_content)
        }

        FibonacciPresenter(fibonacciFragment, this)

    }

    override fun onBackPressed() {
        val drawer = findViewById(com.thedeveloperworldisyours.mathexamples.R.id.fibonacci_drawer_layout) as android.support.v4.widget.DrawerLayout
        if (drawer.isDrawerOpen(android.support.v4.view.GravityCompat.START)) {
            drawer.closeDrawer(android.support.v4.view.GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: android.view.Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(com.thedeveloperworldisyours.mathexamples.R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: android.view.MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            com.thedeveloperworldisyours.mathexamples.R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: android.view.MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            com.thedeveloperworldisyours.mathexamples.R.id.nav_fibonacci -> {
                // Handle the camera action
            }
            com.thedeveloperworldisyours.mathexamples.R.id.nav_most_repeated -> {
                val intent = android.content.Intent(this@FibonacciActivity, MostRepeatedActivity::class.java)
                startActivity(intent)
            }
            com.thedeveloperworldisyours.mathexamples.R.id.nav_slideshow -> {

            }
            com.thedeveloperworldisyours.mathexamples.R.id.nav_manage -> {

            }
            com.thedeveloperworldisyours.mathexamples.R.id.nav_share -> {

            }
            com.thedeveloperworldisyours.mathexamples.R.id.nav_send -> {

            }
        }

        val drawer = findViewById(com.thedeveloperworldisyours.mathexamples.R.id.fibonacci_drawer_layout) as android.support.v4.widget.DrawerLayout
        drawer.closeDrawer(android.support.v4.view.GravityCompat.START)
        return true
    }
}
