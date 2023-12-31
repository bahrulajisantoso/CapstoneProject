package com.example.capstoneproject

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.example.capstoneproject.databinding.ActivityMainBinding
import com.example.capstoneproject.ui.home.HomeFragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarNav.toolbar)

        val toggle = ActionBarDrawerToggle(
            this,
            binding.drawerLayout,
            binding.appBarNav.toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        binding.navView.setNavigationItemSelectedListener(this)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment_content_nav, HomeFragment())
                .commit()
            supportActionBar?.title = getString(R.string.app_name)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var fragment: Fragment? = null
        var title = getString(R.string.app_name)
        when (item.itemId) {
            R.id.nav_home -> {
                fragment = HomeFragment()
                title = getString(R.string.app_name)
            }
            R.id.nav_favorite -> {
                startActivity(
                    Intent(
                        this,
                        Class.forName("com.example.capstoneproject.favorite.FavoriteActivity")
                    )
                )
            }
        }
        if (fragment != null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment_content_nav, fragment)
                .commit()
        }
        supportActionBar?.title = title

        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}

