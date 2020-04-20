package com.example.its;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private  static final String URL = "http://arslan5859.000webhostapp.com/";
    private static Retrofit retrofit;

    public  static  Retrofit getApiClient(){
        if (retrofit==null){

            retrofit = new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create())
            .build();

        }
        return retrofit;

    }
}
