package br.com.esgapp

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {


    //TODO: Queremos acessar a GEOLOCALIZACAO do dispositivo para pegar informacoes

    @GET("v2/city?city=Diadema&state=Sao%20Paulo&country=Brazil&key=a0ac5fd7-a875-4b57-bfeb-6596d71e0f41")
    fun getLocationData(): Call<LocationInfo>
}