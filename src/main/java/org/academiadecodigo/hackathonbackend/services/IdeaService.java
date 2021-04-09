package org.academiadecodigo.hackathonbackend.services;

import org.academiadecodigo.hackathonbackend.models.Idea;

public interface IdeaService {

    Idea getRandomIdea(String mood);

    void delete(Idea idea);
}
