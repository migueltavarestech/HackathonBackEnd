package org.academiadecodigo.hackathonbackend.daos;

import org.academiadecodigo.hackathonbackend.models.Idea;
import org.academiadecodigo.hackathonbackend.models.Mood;

public class IdeasDaoImpl implements IdeasDao {

    private Idea[] allIdeas;

    public Idea[] getAllIdeas() {
        return allIdeas;
    }

    public void populateIdeas(){
        int count = 0;

        Idea evilIdea1 = new Idea();
        evilIdea1.setId(count);
        evilIdea1.setTitle("Tie your grandma to a chair");
        evilIdea1.setDescription("You might need a chair, and a lot of cello tape");
        evilIdea1.setMood(Mood.EVIL_GENIUS);

        Idea goodIdea1 = new Idea();
        goodIdea1.setId(count);
        goodIdea1.setTitle("Check up on your friend that lives alone");
        goodIdea1.setDescription("Mental health is important!");
        goodIdea1.setMood(Mood.GOOD_HEART);

        Idea adventurousIdea1 = new Idea();
        adventurousIdea1.setId(count);
        adventurousIdea1.setTitle("Jump into an ice-cold lake");
        adventurousIdea1.setDescription("Benefits might include boosted immunity");
        adventurousIdea1.setMood(Mood.ADVENTURE);

        Idea normalIdea1 = new Idea();
        normalIdea1.setId(count);
        normalIdea1.setTitle("Read the book that is on your bookshelf");
        normalIdea1.setDescription("We all know it's been left untouched for way too long");
        normalIdea1.setMood(Mood.NORMAL);

        Idea evilIdea2 = new Idea();
        evilIdea2.setId(count);
        evilIdea2.setTitle("Play fetch with the dog but hide the toy behind you");
        evilIdea2.setDescription("Isn't it great seeing their faces of confusion when you do this?");
        evilIdea2.setMood(Mood.EVIL_GENIUS);

        Idea goodIdea2 = new Idea();
        goodIdea2.setId(count);
        goodIdea2.setTitle("Pick up trash from the sidewalk");
        goodIdea2.setDescription("Those damn kids!");
        goodIdea2.setMood(Mood.GOOD_HEART);

        Idea adventurousIdea2 = new Idea();
        adventurousIdea2.setId(count);
        adventurousIdea2.setTitle("Go to the tallest point of your city");
        adventurousIdea2.setDescription("That might be a mountain to hike, a new landmark to discover or just a " +
                "friend of yours that's really tall");
        adventurousIdea2.setMood(Mood.ADVENTURE);

        Idea normalIdea2 = new Idea();
        normalIdea2.setId(count);
        normalIdea2.setTitle("Clean all the dishes");
        normalIdea2.setDescription("They have been piling up, the time to do it is now!");
        normalIdea2.setMood(Mood.NORMAL);
    }
}
