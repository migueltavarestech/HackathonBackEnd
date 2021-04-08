package org.academiadecodigo.hackathonbackend.services;

import org.academiadecodigo.hackathonbackend.model.IdeaMock;

public interface RandomizerService {

    IdeaMock getRandomIdea(String mood);
}
