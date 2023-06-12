package com.example.livefootball

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

//        added
       val signInBtn = findViewById<Button>(R.id.signInBtn);
        signInBtn.setOnClickListener(){
           val i = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(i);
        }

        val signUpBtn = findViewById<TextView>(R.id.signUpText);
        signUpBtn.setOnClickListener(){
            val i = Intent(this@LoginActivity, RegistrationActivity::class.java)
            startActivity(i)
        }
    }
}