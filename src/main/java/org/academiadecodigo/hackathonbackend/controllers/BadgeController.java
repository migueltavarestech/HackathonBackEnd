package org.academiadecodigo.hackathonbackend.controllers;

import org.academiadecodigo.hackathonbackend.models.Badge;
import org.academiadecodigo.hackathonbackend.models.User;
import org.academiadecodigo.hackathonbackend.services.BadgeService;
import org.academiadecodigo.hackathonbackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.LinkedList;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/user/{username}/badges")

public class BadgeController {

    private UserService userService;
    private BadgeService badgeService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setBadgeService(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"", "/"})
    public ResponseEntity<List<Badge>> getUserBadges(@PathVariable String username) {

        User user = userService.get(username);

        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(userService.getUserBadges(user), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, path = {"/{badgeIdentifier}", "/{badgeIdentifier}/"})
    public ResponseEntity<LinkedList<Badge>> addBadge(@PathVariable String username, @PathVariable String badgeIdentifier) {

        userService.addBadge(username, badgeIdentifier);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
