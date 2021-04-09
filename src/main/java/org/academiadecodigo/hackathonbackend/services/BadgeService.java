package org.academiadecodigo.hackathonbackend.services;

import org.academiadecodigo.hackathonbackend.models.Badge;

public interface BadgeService {

    Badge get(String badgeIdentifier);
}
