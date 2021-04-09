package org.academiadecodigo.hackathonbackend.services;

import org.academiadecodigo.hackathonbackend.models.Badge;
import org.academiadecodigo.hackathonbackend.models.Mood;
import org.academiadecodigo.hackathonbackend.models.User;

import java.util.List;

public interface UserService {

    User get(String username);

    User save(User user);

    boolean authenticate(User user, String password);

    List<Badge> getUserBadges(User user);

    void addBadge(String username, Badge badge);
}
