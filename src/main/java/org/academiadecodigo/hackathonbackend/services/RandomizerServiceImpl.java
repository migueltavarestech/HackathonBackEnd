package org.academiadecodigo.hackathonbackend.services;

import org.academiadecodigo.hackathonbackend.daos.IdeasDao;
import org.academiadecodigo.hackathonbackend.model.IdeaMock;
import org.academiadecodigo.hackathonbackend.model.MoodMock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RandomizerServiceImpl implements RandomizerService {

    private IdeasDao ideasDao;

    @Autowired
    public void setIdeasDao(IdeasDao ideasDao) {
        this.ideasDao = ideasDao;
    }

    @Override
    public IdeaMock getRandomIdea(String mood) {
        List<IdeaMock> ideaMocks = Arrays.stream(ideasDao.getIdeas())
                .filter(ideaMock -> MoodMock.valueOf(mood).equals(ideaMock.getMood()))
                .collect(Collectors.toList());
        return ideaMocks.get((int) (Math.floor(Math.random()*ideaMocks.size())));
    }
}
