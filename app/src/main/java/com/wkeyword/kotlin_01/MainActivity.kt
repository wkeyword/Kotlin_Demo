package com.wkeyword.kotlin_01

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import com.wkeyword.kotlin_01.Adapter.NewsAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv_news = findViewById(R.id.rv_news_list) as RecyclerView
        rv_news.layoutManager = LinearLayoutManager(this)
        rv_news.adapter = NewsAdapter(items)
        toast("哈哈哈")
    }

    /**
     * 简单的弹出Toast，相比JAVA写出来是不是很爽
     */
    fun toast(message:String, length:Int = Toast.LENGTH_SHORT){
        Toast.makeText(this,message,length).show();
    }

    private val items = listOf(
            "测试001",
            "测试002"
    )
}
