package org.academiadecodigo.hackathonbackend.daos.mock;

import org.academiadecodigo.hackathonbackend.daos.BadgeDao;
import org.academiadecodigo.hackathonbackend.models.Badge;
import org.springframework.stereotype.Repository;

@Repository
public class BadgeDaoMock implements BadgeDao {

    @Override
    public Badge findByIdentifier(String identifier) {
        return null;
    }
}
