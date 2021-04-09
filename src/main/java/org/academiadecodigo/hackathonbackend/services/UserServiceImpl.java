package org.academiadecodigo.hackathonbackend.services;

import org.academiadecodigo.hackathonbackend.daos.UserDao;
import org.academiadecodigo.hackathonbackend.models.Badge;
import org.academiadecodigo.hackathonbackend.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User get(String email) {
        return userDao.findByEmail(email.toLowerCase());
    }

    @Override
    public User save(User user) {
        if (userDao.getAllUsers().contains(user)) {
            return null;
        }
        return userDao.saveOrUpdate(user);
    }

    @Override
    public boolean authenticate(User user, String password) {
        return user.getPassword().equals(password);
    }

    @Override
    public List<Badge> getUserBadges(User user) {
        return user.getBadges();
    }

    @Override
    public void addBadge(String email, Badge badge) {
        userDao.saveBadge(userDao.findByEmail(email), badge);
    }
}
