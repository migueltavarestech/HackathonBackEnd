package org.academiadecodigo.hackathonbackend.daos;

import org.academiadecodigo.hackathonbackend.models.Idea;
import org.academiadecodigo.hackathonbackend.models.Mood;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class IdeasDaoImpl implements IdeasDao {

    private final List<Idea> allIdeas;
    private int totalIdeas;

    public IdeasDaoImpl() {
        allIdeas = new LinkedList<>();
        populateIdeas();
    }

    public List<Idea> getAllIdeas() {
        return allIdeas;
    }

    public void populateIdeas(){
        newIdea("Tie your grandma to a chair", "You might need a chair, and a lot of cello tape", Mood.EVIL_GENIUS);
        newIdea("Check up on your friend that lives alone", "Mental health is important!", Mood.GOOD_HEART);
        newIdea("Jump into an ice-cold lake", "Benefits might include boosted immunity", Mood.ADVENTURE);
        newIdea("Read the book that is on your bookshelf", "We all know it's been left untouched for way too long", Mood.NORMAL);
        newIdea("Play fetch with the dog but hide the toy behind you", "Isn't it great seeing their faces of confusion when you do this?", Mood.EVIL_GENIUS);
        newIdea("Pick up trash from the sidewalk", "Those damn kids!", Mood.GOOD_HEART);
        newIdea("Go to the tallest point of your city", "That might be a mountain to hike, a new landmark to discover or just a friend of yours that's really tall", Mood.ADVENTURE);
        newIdea("Clean all the dishes", "They have been piling up, the time to do it is now!", Mood.NORMAL);
    }

    public void newIdea(String title, String description, Mood mood) {

        totalIdeas++;
        Idea idea = new Idea();
        idea.setId(totalIdeas);
        idea.setTitle(title);
        idea.setDescription(description);
        idea.setMood(mood);
        allIdeas.add(idea);
    }
}
