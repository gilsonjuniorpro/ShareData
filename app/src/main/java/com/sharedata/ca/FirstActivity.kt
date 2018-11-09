package com.sharedata.ca

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        btGoToSecond.setOnClickListener {
            if(!TextUtils.isEmpty(edFirst.text)) {
                val it = Intent(this, SecondActivity::class.java)
                it.putExtra("text", edFirst.text.toString())
                startActivity(it)
            }else{
                Toast.makeText(this, "Please insert a text", Toast.LENGTH_LONG).show()
            }
        }
    }
}