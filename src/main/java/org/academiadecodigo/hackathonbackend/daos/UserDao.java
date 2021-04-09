package org.academiadecodigo.hackathonbackend.daos;

import org.academiadecodigo.hackathonbackend.models.Badge;
import org.academiadecodigo.hackathonbackend.models.Idea;
import org.academiadecodigo.hackathonbackend.models.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User findByEmail(String email);

    User saveOrUpdate(User user);

    void saveBadge(User user, Badge badge);
}
