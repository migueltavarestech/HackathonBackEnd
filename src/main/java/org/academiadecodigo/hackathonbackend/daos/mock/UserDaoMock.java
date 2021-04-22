package org.academiadecodigo.hackathonbackend.daos.mock;

import org.academiadecodigo.hackathonbackend.daos.UserDao;
import org.academiadecodigo.hackathonbackend.models.Badge;
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
        newUser("coolStuff", "admin1");
        newUser("userVeryMalefic", "admin2");
        newUser("userSuperMegaMalefic", "admin3");
    }


    private void newUser(String email, String password) {

        if(allUsers.stream().anyMatch(user -> user.getEmail().equals(email.toLowerCase()))) {
            System.out.println("USER ALREADY EXISTS");
            return;
        }

        User user = new User(email.toLowerCase(), password);
        allUsers.add(user);
    }

    @Override
    public List<User> getAllUsers() {
        return allUsers;
    }

    //TODO - verify findFirst()
    @Override
    public User findByEmail(String email) {
        return allUsers.stream()
                .filter(user -> user.getEmail().equals(email.toLowerCase()))
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
