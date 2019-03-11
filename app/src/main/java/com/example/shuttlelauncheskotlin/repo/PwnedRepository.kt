package com.example.shuttlelauncheskotlin.repo

import com.example.shuttlelauncheskotlin.data.DataSource

class PwnedRepository(private val remoteDataSource: DataSource) : DataSource {
    override fun getListOfBreaches(domainName: String) =
        remoteDataSource.getListOfBreaches(domainName)
}