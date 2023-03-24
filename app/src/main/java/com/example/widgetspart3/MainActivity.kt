package com.example.widgetspart3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et1=findViewById<EditText>(R.id.et1)
        val et2=findViewById<EditText>(R.id.et2)
        val btn=findViewById<Button>(R.id.bt)
        val pb1=findViewById<ProgressBar>(R.id.progressbar1)
        val pb2=findViewById<ProgressBar>(R.id.progressbar2)

        var count=0;

//        btn.setOnClickListener(new View.OnClickListener(){
//
//        })

    }
}