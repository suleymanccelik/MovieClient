package com.suleymancelik.movieclient

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.suleymancelik.movieclient.common.ui.binding.viewBinding
import com.suleymancelik.movieclient.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val mainActivityBinding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mainActivityBinding.root)
        prepareNavigation()
    }

    private fun prepareNavigation() {
        setSupportActionBar(mainActivityBinding.toolbar)
        val navController = findNavController(R.id.nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.navigation_home))
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

}