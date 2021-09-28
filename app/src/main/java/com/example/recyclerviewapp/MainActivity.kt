package com.example.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
     private lateinit var const:ConstraintLayout
    private lateinit var editText: EditText
    private lateinit var button: Button
    private lateinit var messages: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        const = findViewById(R.id.const11)
        messages = ArrayList()

        recyclerView.adapter = RecyclerViewAdapter(this, messages)
        recyclerView.layoutManager = LinearLayoutManager(this)

        editText = findViewById(R.id.editText)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            val msg = editText.text.toString()
            messages.add(msg)
            editText.text.clear()
        }


    }
    private fun addMessage(){
        val msg = editText.text.toString()
        if(msg.isNotEmpty()){
            messages.add(msg)
            editText.text.clear()
            editText.clearFocus()
        }else{
            Snackbar.make(const, "Enter any text here", Snackbar.LENGTH_LONG).show()
        }
    }

}