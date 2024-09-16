package com.aj.poc.entity;

public class WebSocketChatMessage {
    private String type;
    private String content;
    private String user;
    private String phoneNumber;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "WebSocketChatMessage{" +
                "type='" + type + '\'' +
                ", content='" + content + '\'' +
                ", user='" + user + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
