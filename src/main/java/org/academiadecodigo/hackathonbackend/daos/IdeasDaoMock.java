package org.academiadecodigo.hackathonbackend.daos;

import org.academiadecodigo.hackathonbackend.model.IdeaMock;

public class IdeasDaoMock implements IdeasDao {

    private IdeaMock[] ideas;

    @Override
    public IdeaMock[] getIdeas() {
        return ideas;
    }
}
