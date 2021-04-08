package org.academiadecodigo.hackathonbackend.services;

import org.academiadecodigo.hackathonbackend.models.Idea;

public interface RandomizerService {

    Idea getRandomIdea(String mood);
}
