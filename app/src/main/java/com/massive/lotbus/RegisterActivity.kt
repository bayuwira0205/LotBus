package com.massive.lotbus

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    private lateinit var  btn_regis:Button
    private lateinit var tv_login:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        
        btn_regis=findViewById(R.id.btn_regis)
        tv_login=findViewById(R.id.tv_login)

        tv_login.setOnClickListener {
            intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        btn_regis.setOnClickListener {
            Toast.makeText(this, "Registrasi Berhasil", Toast.LENGTH_SHORT).show()
            intent = Intent(this, LoginActivity::class.java)
            startActivity(intent) 
        }
        
    }
}