package com.example.avengers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

lateinit var but_logout:Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scroll_example)
        but_logout=findViewById(R.id.but_logout)
        but_logout.setOnClickListener {
            Toast.makeText(this, "Logged Out", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@MainActivity,New_Activity::class.java))
            sharedPreferences.edit().clear().apply()
            finish()
        }
    }

}