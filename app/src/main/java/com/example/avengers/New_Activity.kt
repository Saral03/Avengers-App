package com.example.avengers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

lateinit var logo:ImageView
    lateinit var email:EditText
    lateinit var pass:EditText
    lateinit var fp:TextView
    lateinit var register:TextView
    lateinit var but:Button
class New_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        title="Log In"
        logo=findViewById(R.id.logo)
        email=findViewById(R.id.email)
        pass=findViewById(R.id.pass)
        fp=findViewById(R.id.fp)
        register=findViewById(R.id.register)
        but=findViewById(R.id.but)
        but.setOnClickListener {
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
            val intent=Intent(this@New_Activity,MainActivity::class.java)
            startActivity(intent)
        }

    }
}