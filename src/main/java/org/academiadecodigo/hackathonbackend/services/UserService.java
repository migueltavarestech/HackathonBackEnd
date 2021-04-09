package org.academiadecodigo.hackathonbackend.services;

import org.academiadecodigo.hackathonbackend.models.Badge;
import org.academiadecodigo.hackathonbackend.models.User;

import java.util.List;

public interface UserService {

    User get(String username);

    List<Badge> getUserBadges(User user);

    void addBadge(String username, String badgeIdentifier);
}
