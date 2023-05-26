package com.example.interns_demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.moengage.cards.ui.CardActivity
import com.moengage.core.MoECoreHelper

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_application)

        val loginbtn = findViewById<View>(R.id.loginbtn) as MaterialButton
        val inbox = findViewById<View>(R.id.inbox) as MaterialButton

        //admin and admin
        loginbtn.setOnClickListener {

                Toast.makeText(this@MainActivity2, "Welcome Back", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@MainActivity2, Mainpage::class.java)
            startActivity(intent)
        }

        inbox.setOnClickListener {

            val intent = Intent(this@MainActivity2, CardActivity::class.java)
            startActivity(intent)
        }
    }
}