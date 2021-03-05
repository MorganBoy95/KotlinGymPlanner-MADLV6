package com.sid1629603.every_move

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GetStarted : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.get_started)

        val button = findViewById<Button>(R.id.register)
        button.setOnClickListener{
            val intent = Intent(this, second::class.java)
            startActivity(intent)
        }
    }
}