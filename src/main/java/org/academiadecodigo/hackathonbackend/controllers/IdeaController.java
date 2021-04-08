package org.academiadecodigo.hackathonbackend.controllers;

import org.academiadecodigo.hackathonbackend.models.Idea;
import org.academiadecodigo.hackathonbackend.services.RandomizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/idea")
public class IdeaController {

    private RandomizerService randomizerService;

    @Autowired
    public void setRandomizerService(RandomizerService randomizerService) {
        this.randomizerService = randomizerService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/generate/{mood}", "/generate/{mood}/"})
    public ResponseEntity<Idea> getIdea(@PathVariable String mood) {

        return new ResponseEntity<>(randomizerService.getRandomIdea(mood), HttpStatus.OK);
    }
}
