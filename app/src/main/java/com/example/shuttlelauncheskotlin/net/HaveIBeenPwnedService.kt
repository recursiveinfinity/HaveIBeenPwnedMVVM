package com.example.shuttlelauncheskotlin.net

import com.example.shuttlelauncheskotlin.ENDPOINT
import com.example.shuttlelauncheskotlin.data.Breach
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface HaveIBeenPwnedService {

    @GET(ENDPOINT)
    fun getListOfBreaches(@Query("domain") siteName: String): Observable<List<Breach>>
}