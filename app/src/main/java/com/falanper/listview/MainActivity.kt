package com.falanper.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.list_view)

        val arrayList: ArrayList<Data> = ArrayList()

        arrayList.add(Data("0", "audio_0"))
        arrayList.add(Data("1", "audio_1"))
        arrayList.add(Data("2", "audio_2"))
        arrayList.add(Data("3", "audio_3"))
        arrayList.add(Data("4", "audio_4"))
        arrayList.add(Data("5", "audio_5"))
        arrayList.add(Data("6", "audio_6"))
        arrayList.add(Data("7", "audio_7"))
        arrayList.add(Data("8", "audio_8"))
        arrayList.add(Data("9", "audio_9"))
        arrayList.add(Data("10", "audio_10"))

        val customAdapter = MyAdapter(arrayList)
        listView.adapter = customAdapter
    }
}