package com.example.rizzmi.model.api;

import com.google.gson.annotations.SerializedName;

public class Role {

    @SerializedName("name")
    private String name;

    @SerializedName("group")
    private int group;

    @SerializedName("priority_level")
    private int level;

    public Role() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
