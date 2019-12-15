package com.example.rizzmi.service;

import com.example.rizzmi.model.api.Assignment;
import com.example.rizzmi.model.api.Credentials;
import com.example.rizzmi.model.api.RegResponse;
import com.example.rizzmi.model.api.Registration;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiServices {

    @POST("login")
    Call<RegResponse> login(@Body Credentials user);

    @POST("signup")
    Call<RegResponse> signup(@Body Registration registration);

    @GET("/user/{id}/assignments")
    Call<List<Assignment>> getAssigmnets(@Path("id") String id);

    @POST("/user/{userId}/assignments/{assignmentId}")
    Call<Assignment> updateAssignment(@Path("userId") String userId, @Path("assignmentId") String assignmentId);
}
