package org.academiadecodigo.hackathonbackend.services;

import org.academiadecodigo.hackathonbackend.daos.BadgeDao;
import org.academiadecodigo.hackathonbackend.daos.UserDao;
import org.academiadecodigo.hackathonbackend.models.Badge;
import org.academiadecodigo.hackathonbackend.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private BadgeDao badgeDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    public void setBadgeDao(BadgeDao badgeDao) {
        this.badgeDao = badgeDao;
    }

    @Override
    public User get(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public List<Badge> getUserBadges(User user) {
        return user.getBadges();
    }

    @Override
    public void addBadge(String username, String badgeIdentifier) {
        userDao.saveBadge(userDao.findByUsername(username), badgeDao.findByIdentifier(badgeIdentifier));
    }
}
