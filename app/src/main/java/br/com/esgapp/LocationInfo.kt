package br.com.esgapp

import com.google.gson.annotations.SerializedName

data class LocationInfo (
    @SerializedName("status")   val status: String,
    @SerializedName("data")     val data: Data,
)


data class Data (
    @SerializedName("city")     val city: String,
    @SerializedName("state")    val state: String,
    @SerializedName("country")  val country: String,
    @SerializedName("current")  val current: Current
)

data class Current (
    @SerializedName("weather") val weather: Weather,
)

data class Weather (
    @SerializedName("ts") val ts: String,
    @SerializedName("tp") val tp: Float,
    @SerializedName("pr") val pr: Float,
    @SerializedName("hu") val hu: Float,
    @SerializedName("ws") val ws: Float,
    @SerializedName("ic") val ic: String
)

