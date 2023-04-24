package com.example.submenu

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_submenu_item1 -> {
                Toast.makeText(this, "Submenu Item 1 clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_submenu_item2 -> {
                Toast.makeText(this, "Submenu Item 2 clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_submenu_item3 -> {
                Toast.makeText(this, "Submenu Item 3 clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

}
