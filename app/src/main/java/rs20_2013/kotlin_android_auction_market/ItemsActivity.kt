package rs20_2013.kotlin_android_auction_market

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_items.*
import kotlinx.android.synthetic.main.app_bar_items.*
import android.widget.TextView



class ItemsActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)
        setSupportActionBar(toolbar)

        /* Floating Action Button
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        */

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

        val navViewHeader = nav_view.getHeaderView(0) as View

        // User Details
        navViewHeader.setOnClickListener {
            val intent = Intent(applicationContext, UserActivity::class.java)
            startActivity(intent)
        }

        // Set User Img, Name and Email
        navViewHeader.findViewById<ImageView>(R.id.nav_user_img).setImageResource(R.drawable.am_logo)
        navViewHeader.findViewById<TextView>(R.id.nav_user_name).text = "Novo Ime Korisnika"
        navViewHeader.findViewById<TextView>(R.id.nav_user_email).text = "novi_email@email.com"

    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_start_auction -> {
                // Handle the camera action
            }
            R.id.nav_my_items -> {

            }
            R.id.nav_my_bids -> {

            }
            R.id.nav_all_items -> {

            }
            R.id.nav_settings -> {
                Handler().run { Runnable {
                    val intent = Intent(applicationContext, SettingsActivity::class.java)
                    startActivity(intent)
                    finish()
                } }
            }
            R.id.nav_logout -> {

            }
         }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
