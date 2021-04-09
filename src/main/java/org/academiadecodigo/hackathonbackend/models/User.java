package org.academiadecodigo.hackathonbackend.models;

import java.util.LinkedList;

public class User {

    private String username;
    private Mood mood;
    private LinkedList<Badge> badges;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public LinkedList<Badge> getBadges() {
        return badges;
    }

    public void setBadges(LinkedList<Badge> badges) {
        this.badges = badges;
    }

    public void addBadge(Badge badge) {
        badges.add(badge);
    }
}
