package com.example.shuttlelauncheskotlin.net

import com.example.shuttlelauncheskotlin.ENDPOINT
import com.example.shuttlelauncheskotlin.data.Breach
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface HaveIBeenPwnedService {

    @GET(ENDPOINT)
    fun getListOfBreaches(@Path("siteName")siteName: String): Observable<List<Breach>>
}