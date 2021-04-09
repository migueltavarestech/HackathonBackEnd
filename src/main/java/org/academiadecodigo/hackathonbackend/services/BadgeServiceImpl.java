package org.academiadecodigo.hackathonbackend.services;

import org.academiadecodigo.hackathonbackend.daos.BadgeDao;
import org.academiadecodigo.hackathonbackend.models.Badge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BadgeServiceImpl implements BadgeService {

    private BadgeDao badgeDao;

    @Autowired
    public void setBadgeDao(BadgeDao badgeDao) {
        this.badgeDao = badgeDao;
    }

    @Override
    public Badge get(String badgeIdentifier) {
        return badgeDao.findByIdentifier(badgeIdentifier);
    }
}
