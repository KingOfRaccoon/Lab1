package ru.gromysh.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val text = findViewById<EditText>(R.id.edittext)
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra(tagName, text.text.toString())
            startActivity(intent)
            finish()
        }
    }
}
val tagName = "name"