package com.aj.poc.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class User {

    @EmbeddedId
    private UserId userId;

    private String userName;

    private Date signupDate;

    private Boolean isActive;

    public UserId getUserId() {
        return userId;
    }

    public void setUserId(UserId userId) {
        this.userId = userId;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getSignupDate() {
        return signupDate;
    }

    public void setSignupDate(Date signupDate) {
        this.signupDate = signupDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", signupDate=" + signupDate +
                ", isActive=" + isActive +
                '}';
    }
}
