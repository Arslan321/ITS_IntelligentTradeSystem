package com.example.its;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("accounts.php")
    Call<BasicResponse> saveNote(@Field("name") String name ,@Field("email") String email
    ,@Field("mnumber") String number ,@Field("location") String location
    ,@Field("password") String password
    );

    @FormUrlEncoded
    @POST("login.php")
    Call<BasicResponse> login(@Field("action") String login , @Field("email") String email ,@Field("password") String password);
}
