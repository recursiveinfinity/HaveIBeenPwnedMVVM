package com.example.shuttlelauncheskotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.shuttlelauncheskotlin.data.DataSource
import com.example.shuttlelauncheskotlin.data.RemoteDataSource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataSource: DataSource = RemoteDataSource()
        dataSource.getListOfBreaches("Adobe")
    }
}
