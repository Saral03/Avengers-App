package com.example.avengers

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

    lateinit var logo:ImageView
    lateinit var email:EditText
    lateinit var pass:EditText
    lateinit var fp:TextView
    lateinit var register:TextView
    lateinit var but:Button
    lateinit var sharedPreferences: SharedPreferences
    val em="saralhanda13@gmail.com"
    val pwd="Spicemi5"
    class New_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferences=getSharedPreferences(getString(R.string.my_preference), Context.MODE_PRIVATE)
        val IsloggedIn= sharedPreferences.getBoolean("IsloggedIn",false)/* it will take deafult value of false if user has not logged in*/
        setContentView(R.layout.activity_new)
        if (IsloggedIn){
            val intent=Intent(this@New_Activity,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        title="Log In"
        logo=findViewById(R.id.logo)
        email=findViewById(R.id.email)
        pass=findViewById(R.id.pass)
        fp=findViewById(R.id.fp)
        register=findViewById(R.id.register)
        but=findViewById(R.id.but)
        but.setOnClickListener {
            var check_email= email.text.toString()
            var check_password=pass.text.toString()
            if (( check_email==em) && (check_password == pwd)){
                Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
                savedPreference()
                val intent=Intent(this@New_Activity,MainActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Invalid Mobile/Password", Toast.LENGTH_SHORT).show()
            }
        }


    }

    override fun onPause() {
        super.onPause()
        finish()
   }
        fun savedPreference(){
            sharedPreferences.edit().putBoolean("IsloggedIn",true).apply()
        }
}