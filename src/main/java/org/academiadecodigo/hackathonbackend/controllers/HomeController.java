package org.academiadecodigo.hackathonbackend.controllers;

import org.academiadecodigo.hackathonbackend.models.Mood;
import org.academiadecodigo.hackathonbackend.services.MoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/home")
public class HomeController {

    private MoodService moodService;

    @Autowired
    public void setMoodService(MoodService moodService) {
        this.moodService = moodService;
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/getMood", "/getMood/"})
    public ResponseEntity<?> chooseMood(BindingResult bindingResult, @RequestBody String mood) {

        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        moodService.setCurrentMood(Mood.valueOf(mood));

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
