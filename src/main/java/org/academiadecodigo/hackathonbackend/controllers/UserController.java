package org.academiadecodigo.hackathonbackend.controllers;

import org.academiadecodigo.hackathonbackend.models.Badge;
import org.academiadecodigo.hackathonbackend.models.User;
import org.academiadecodigo.hackathonbackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/user/{username}")
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"", "/"})
    public ResponseEntity<User> getUser(@PathVariable String username) {

        User user = userService.get(username);

        if (user == null) {

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        // DTOs??
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, path = {"/mood", "/mood/"})
    public ResponseEntity<LinkedList<Badge>> chooseMood(@PathVariable String username) {

        return new ResponseEntity<>(HttpStatus.OK);
    }



}
