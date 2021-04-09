package org.academiadecodigo.hackathonbackend.controllers;

import org.academiadecodigo.hackathonbackend.models.Idea;
import org.academiadecodigo.hackathonbackend.services.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/idea")
public class IdeaController {

    private IdeaService ideaService;

    @Autowired
    public void setRandomizerService(IdeaService ideaService) {
        this.ideaService = ideaService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/generate/{mood}", "/generate/{mood}/"})
    public ResponseEntity<Idea> getIdea(@PathVariable String mood) {
        Idea idea = ideaService.getRandomIdea(mood);
        ideaService.delete(idea);
        return new ResponseEntity<>(idea, HttpStatus.OK);
    }
}
