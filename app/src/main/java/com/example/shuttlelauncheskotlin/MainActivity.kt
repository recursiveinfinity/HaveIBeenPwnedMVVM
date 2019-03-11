package com.example.shuttlelauncheskotlin

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.shuttlelauncheskotlin.home.HomeViewModel
import com.example.shuttlelauncheskotlin.home.ResultsAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeViewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)

        val resultsAdapter = ResultsAdapter()
        rvResults.layoutManager = LinearLayoutManager(this)
        rvResults.adapter = resultsAdapter

        homeViewModel.getBreachesObservable().observe(this, Observer { resultsAdapter.setData(it) })

        btnGetBreaches.setOnClickListener { homeViewModel.getData(etDomainName.text.toString()) }
    }
}
