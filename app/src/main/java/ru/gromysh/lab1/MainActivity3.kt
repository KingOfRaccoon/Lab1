package ru.gromysh.lab1

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity3: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val fio = intent.getStringExtra(tagName)
        findViewById<TextView>(R.id.text1).text = "Добро пожаловать, $fio"
    }
}