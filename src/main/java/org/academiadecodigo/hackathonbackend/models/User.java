package org.academiadecodigo.hackathonbackend.models;

import java.util.LinkedList;
import java.util.Objects;

public class User {

    private String email;
    private String password;
    private final LinkedList<Badge> badges;

    public User() {
        badges = new LinkedList<>();
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
        badges = new LinkedList<>();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public LinkedList<Badge> getBadges() {
        return badges;
    }

    public void addBadge(Badge badge) {
        badges.add(badge);
    }

}
