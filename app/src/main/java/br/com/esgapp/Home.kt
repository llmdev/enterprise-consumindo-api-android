package br.com.esgapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        val inputCidade =  findViewById<TextView>(R.id.input_cidade)
        val inputTemperatura = findViewById<TextView>(R.id.input_temperatura)
        val inputHumidade = findViewById<TextView>(R.id.input_humidade)
        val inputVelocidadeVento = findViewById<TextView>(R.id.input_velocidade_vento)

        val call = RetrofitFactory().retrofitService().getLocationData()

        call.enqueue(object: Callback<LocationInfo> {
            override fun onResponse(call: Call<LocationInfo>, response: Response<LocationInfo>) {
                response.body()?.let {
                    Log.i("retorno api", it.toString())
                    inputCidade.text = it.data.city
                    inputTemperatura.text = it.data.current.weather.tp.toString() + "C"
                    inputHumidade.text = it.data.current.weather.hu.toString() + "%"
                    inputVelocidadeVento.text = it.data.current.weather.ws.toString() + "M/S"
                }
            }

            override fun onFailure(call: Call<LocationInfo>, t: Throwable) {
                t?.message.let{
                    it1 -> Log.e("erro", it1.toString())
                }
            }
        })

    }
}