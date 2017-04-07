package com.wkeyword.kotlin_01

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toast("哈哈哈")
    }

    fun toast(message:String, length:Int = Toast.LENGTH_SHORT){
        Toast.makeText(this,message,length).show();
    }
}
