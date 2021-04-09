package org.academiadecodigo.hackathonbackend.controllers;

import org.academiadecodigo.hackathonbackend.models.User;
import org.academiadecodigo.hackathonbackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/")
public class LoginController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.POST, path = {"login", "login/"})
    public ResponseEntity<User> doLogin(@RequestBody User user, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        User dbUser = userService.get(user.getUsername());

        if (dbUser == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        if (!userService.authenticate(dbUser, user.getPassword())) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
        // DTOs??
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.POST, path = {"signup", "signup/"})
    public ResponseEntity<User> signUp(@RequestBody User user) {

        if (userService.get(user.getUsername()) != null) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }

        userService.save(user);
        // DTOs??
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
