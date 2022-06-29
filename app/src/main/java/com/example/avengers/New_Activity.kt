package com.example.avengers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

lateinit var logo:ImageView
    lateinit var mobile:EditText
    lateinit var pass:EditText
    lateinit var fp:TextView
    lateinit var register:TextView
    lateinit var but:Button
    val mob="7905796404"
    val pwd="Spicemi5"
class New_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        title="Log In"
        logo=findViewById(R.id.logo)
        mobile=findViewById(R.id.mobile)
        pass=findViewById(R.id.pass)
        fp=findViewById(R.id.fp)
        register=findViewById(R.id.register)
        but=findViewById(R.id.but)
        but.setOnClickListener {
            val check_mob= mobile.text.toString()
            val check_password=pass.text.toString()
            if (mob==check_mob && pwd==check_password){
                Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
                val intent=Intent(this@New_Activity,MainActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Invalid Mobile/Password", Toast.LENGTH_SHORT).show()
            }
        }

    }
}