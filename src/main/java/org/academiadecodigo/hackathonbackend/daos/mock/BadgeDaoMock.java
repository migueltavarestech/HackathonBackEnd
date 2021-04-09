package org.academiadecodigo.hackathonbackend.daos.mock;

import org.academiadecodigo.hackathonbackend.daos.BadgeDao;
import org.academiadecodigo.hackathonbackend.models.Badge;
import org.academiadecodigo.hackathonbackend.models.Idea;
import org.academiadecodigo.hackathonbackend.models.User;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class BadgeDaoMock implements BadgeDao {

    private final List<Badge> allBadges;
    private int totalBadges;

    public BadgeDaoMock() {
        allBadges = new LinkedList<>();
        populateBadges();
    }

    private void populateBadges() {
        newBadge("Mini-Malefic", "Complete your first evil task");
        newBadge("Very-Malefic", "Complete your first 10 evil tasks");
        newBadge("Much Good-Heartened", "Do the task 'Help an old woman'");
    }

    private void newBadge(String title, String description) {
        totalBadges++;
        Badge badge = new Badge.BadgeBuilder()
                .setId(totalBadges)
                .setTitle(title)
                .setDescription(description)
                .build();
        allBadges.add(badge);
    }

    @Override
    public Badge findById(Integer id) {
        return allBadges.stream()
                .filter(badge -> badge.getId() == id)
                .findAny()
                .orElse(null);
    }
}
