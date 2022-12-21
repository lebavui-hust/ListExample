package com.example.test5.models;

public class ChatModel {
    private String username;
    private int avatarResource;
    private String message;

    public ChatModel(String username, int avatarResource, String message) {
        this.username = username;
        this.avatarResource = avatarResource;
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAvatarResource() {
        return avatarResource;
    }

    public void setAvatarResource(int avatarResource) {
        this.avatarResource = avatarResource;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
