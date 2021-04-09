package org.academiadecodigo.hackathonbackend.services;

import org.academiadecodigo.hackathonbackend.models.Mood;
import org.springframework.stereotype.Service;

@Service
public class MoodServiceImpl implements MoodService {

    private Mood currentMood;

    public Mood getCurrentMood() {
        return currentMood;
    }

    public void setCurrentMood(Mood currentMood) {
        this.currentMood = currentMood;
    }
}
