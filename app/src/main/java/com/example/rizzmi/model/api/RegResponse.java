package com.example.rizzmi.model.api;

import com.example.rizzmi.model.User;
import com.google.gson.annotations.SerializedName;


public class RegResponse {


    @SerializedName("login")
    private boolean success;

    @SerializedName("user")
    private User user;

    public RegResponse() {
    }

    public RegResponse(boolean success) {
        this.success = success;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "RegResponse{" +
                "success=" + success +
                '}';
    }
}
