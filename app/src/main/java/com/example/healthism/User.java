package com.example.healthism;

public class User {
    String name, username, password;

    public User(String name, String username, String password) {
        this.name = name;
        this.username =username;
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
