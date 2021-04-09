package org.academiadecodigo.hackathonbackend.services;

import org.academiadecodigo.hackathonbackend.daos.IdeasDao;
import org.academiadecodigo.hackathonbackend.daos.mock.IdeasDaoMock;
import org.academiadecodigo.hackathonbackend.models.Idea;
import org.academiadecodigo.hackathonbackend.models.Mood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IdeaServiceImpl implements IdeaService {

    private IdeasDaoMock ideasDao;

    @Autowired
    public void setIdeasDao(IdeasDaoMock ideasDao) {
        this.ideasDao = ideasDao;
    }

    @Override
    public Idea getRandomIdea(String mood) {
        List<Idea> ideas = ideasDao.getAllIdeas().stream()
                .filter(idea -> Mood.valueOf(mood).equals(idea.getMood()))
                .collect(Collectors.toList());
        return ideas.get((int) (Math.floor(Math.random()*ideas.size())));
    }

    @Override
    public void delete(Idea idea) {
        ideasDao.delete(idea);
    }
}
