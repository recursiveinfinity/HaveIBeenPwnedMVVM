package com.example.shuttlelauncheskotlin.data

import com.example.shuttlelauncheskotlin.BASE_URL
import com.example.shuttlelauncheskotlin.net.HaveIBeenPwnedService
import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RemoteDataSource : DataSource {

    private val haveIBeenPwnedService: HaveIBeenPwnedService by lazy {
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .build()
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .build()
        retrofit.create(HaveIBeenPwnedService::class.java)
    }

    override fun getListOfBreaches(domainName: String)
            = haveIBeenPwnedService.getListOfBreaches(domainName)

}