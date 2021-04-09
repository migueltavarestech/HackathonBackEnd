package org.academiadecodigo.hackathonbackend.daos;

import org.academiadecodigo.hackathonbackend.models.Badge;

public interface BadgeDao {

    Badge findByIdentifier(String identifier);
}
