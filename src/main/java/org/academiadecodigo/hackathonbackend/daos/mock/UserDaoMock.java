package org.academiadecodigo.hackathonbackend.daos.mock;

import org.academiadecodigo.hackathonbackend.daos.UserDao;
import org.academiadecodigo.hackathonbackend.models.Badge;
import org.academiadecodigo.hackathonbackend.models.Mood;
import org.academiadecodigo.hackathonbackend.models.User;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class UserDaoMock implements UserDao {

    private final List<User> allUsers;

    public UserDaoMock() {
        allUsers = new LinkedList<>();
        populateUsers();
    }

    private void populateUsers() {
        newUser("coolStuff");
        newUser("userVeryMalefic");
        newUser("userSuperMegaMalefic");
    }

    private void newUser(String username) {

        if(allUsers.stream().anyMatch(user -> user.getUsername().equals(username.toLowerCase()))) {
            System.out.println("USER ALREADY EXISTS");
            return;
        }

        User user = new User();
        user.setUsername(username.toLowerCase());
        allUsers.add(user);
    }

    @Override
    public List<User> getAllUsers() {
        return allUsers;
    }

    @Override
    public User findByUsername(String username) {
        return allUsers.stream()
                .filter(user -> user.getUsername().equals(username.toLowerCase()))
                .findAny()
                .orElse(null);
    }

    @Override
    public User saveOrUpdate(User user) {
        allUsers.add(user);
        return user;
    }

    @Override
    public void saveBadge(User user, Badge badge) {
        user.addBadge(badge);
    }

}
