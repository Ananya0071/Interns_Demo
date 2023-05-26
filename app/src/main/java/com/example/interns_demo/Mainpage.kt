package com.example.interns_demo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.moengage.core.analytics.MoEAnalyticsHelper
import com.moengage.inapp.MoEInAppHelper
import com.moengage.pushbase.MoEPushHelper
import com.moengage.core.config.LogConfig


class Mainpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<View>(R.id.username) as TextView
        val password = findViewById<View>(R.id.password) as TextView
        val loginbtn = findViewById<View>(R.id.loginbtn) as MaterialButton
     //   requestNotificationPermission()
        //MoEPushHelper.getInstance().requestPushPermission(application)

        //admin and admin
        loginbtn.setOnClickListener {
            if (username.text.toString() == "admin" && password.text.toString() == "admin") {
                //correct
                Toast.makeText(this@Mainpage, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show()
                MoEAnalyticsHelper.setUniqueId(this, username.text.toString())
                val properties = com.moengage.core.Properties()
                MoEAnalyticsHelper.setFirstName(this,username.text.toString())
                MoEAnalyticsHelper.trackEvent(this, "login", properties)
                val intent = Intent(this@Mainpage, MainActivity2::class.java)
                startActivity(intent)
            } else  //incorrect
                Toast.makeText(this@Mainpage, "LOGIN FAILED!", Toast.LENGTH_SHORT).show()
        }
    }
//    private fun requestNotificationPermission(){
//        MoEPushHelper.getInstance().requestPushPermission(this)
//
//    }

    override fun onStart() {
        super.onStart()

        MoEInAppHelper.getInstance().showInApp(this)
    }
}