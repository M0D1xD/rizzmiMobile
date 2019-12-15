package com.example.rizzmi.model.api;

import com.google.gson.annotations.SerializedName;

public class AssignmentResponse {
    @SerializedName("msg")
    private String message;
//"msg": "no assignments found"
    public AssignmentResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
