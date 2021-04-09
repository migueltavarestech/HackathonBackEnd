package org.academiadecodigo.hackathonbackend.daos;

import org.academiadecodigo.hackathonbackend.models.Badge;
import org.academiadecodigo.hackathonbackend.models.Idea;
import org.academiadecodigo.hackathonbackend.models.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User findByUsername(String username);

    void saveBadge(User user, Badge badge);
}
