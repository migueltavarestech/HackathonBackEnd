package org.academiadecodigo.hackathonbackend.daos;

import org.academiadecodigo.hackathonbackend.models.Idea;

import java.util.List;

public interface IdeasDao {

    List<Idea> getAllIdeas();

    void delete(Idea idea);

}
