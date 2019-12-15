package com.example.rizzmi.model;

import androidx.annotation.Nullable;

import com.example.rizzmi.model.api.Role;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class User {
    @SerializedName("_cls")
    private String _cls;
    @SerializedName("_id")
    private String userId;

    @SerializedName("first_name")
    private String first_name;

    @SerializedName("last_name")
    private String last_name;

    @SerializedName("email")
    private String email;

    @SerializedName("phone_number")
    private String phone_number;

    @SerializedName("password")
    private String password;

    @Nullable
    @SerializedName("company")
    private String companyId;

    @SerializedName("creation_date")
    private Date join_date;
    @SerializedName("modified_date")
    private Date modified_date;
    @Nullable
    @SerializedName("role")
    private Role[] role;

    public String get_cls() {
        return _cls;
    }

    public void set_cls(String _cls) {
        this._cls = _cls;
    }

    public Date getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }

    public Date getModified_date() {
        return modified_date;
    }

    public void setModified_date(Date modified_date) {
        this.modified_date = modified_date;
    }

    @Nullable
    public Role[] getRole() {
        return role;
    }

    public void setRole(@Nullable Role[] role) {
        this.role = role;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    @Nullable
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(@Nullable String companyId) {
        this.companyId = companyId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
