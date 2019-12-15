package com.example.rizzmi.model.api;

import com.google.gson.annotations.SerializedName;

public class Task {

    @SerializedName("name")
    private String name;

    @SerializedName("priority")
    private int priority;

    @SerializedName("description")
    private String decs;

    @SerializedName("subject")
    private int subject;

    @SerializedName("action")
    private String action;

    public Task() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDecs() {
        return decs;
    }

    public void setDecs(String decs) {
        this.decs = decs;
    }

    public int getSubject() {
        return subject;
    }

    public void setSubject(int subject) {
        this.subject = subject;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
