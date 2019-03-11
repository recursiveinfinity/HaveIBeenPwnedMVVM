package com.example.shuttlelauncheskotlin.data

import com.google.gson.annotations.SerializedName

data class Breach(@SerializedName("Name") val name: String,
                  @SerializedName("BreachDate") val breachDate: String,
                  @SerializedName("Description") val description: String)