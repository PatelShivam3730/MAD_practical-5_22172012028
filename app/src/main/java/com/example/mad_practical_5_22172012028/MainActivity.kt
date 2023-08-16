package com.example.mad_practical_5_22172012028

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val browse_Button: Button = findViewById(R.id.button_browse)
        val editTextbrowser: EditText = findViewById(R.id.editTextText2)
        browse_Button.setOnClickListener {
            OpenUrl(editTextbrowser.text.toString())
        }
    }
    fun OpenUrl(url:String)
    {
    Intent(Intent.ACTION_VIEW, Uri.parse(url)).also { startActivity(it) }
    }
    fun phone(phone:String)
    {
        Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel,$phone")).also { startActivity(it) }
    }
    fun callLog()
    {

    }
    fun gallery(gallery:String)
    {

    }
    fun camera()
    {

    }
    fun alarm()
    {

    }
}