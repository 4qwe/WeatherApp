package com.example.weatherapp;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.http.GET;

public interface WeatherService {

    @GET("data/2.5/weather?q=Bremen&appid=a454163a7b441dc41f3261c896234058")
    Call<WeatherInfo> getWeather();


}
