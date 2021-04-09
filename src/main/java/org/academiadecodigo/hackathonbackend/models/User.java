package org.academiadecodigo.hackathonbackend.models;

import java.util.LinkedList;
import java.util.Objects;

public class User {

    private final String email;
    private final String password;
    //private final LinkedList<Badge> badges;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
        //badges = new LinkedList<>();
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    //public LinkedList<Badge> getBadges() {
        //return badges;
    //}

    //public void addBadge(Badge badge) {
        //badges.add(badge);
    //}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
