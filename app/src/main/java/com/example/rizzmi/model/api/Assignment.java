package com.example.rizzmi.model.api;

import com.google.gson.annotations.SerializedName;

public class Assignment {

    @SerializedName("task")
    private Task task;
    @SerializedName("to")
    private String to;
    @SerializedName("status")
    private String status;


    public Assignment() {
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
