package org.academiadecodigo.hackathonbackend.daos.mock;

import org.academiadecodigo.hackathonbackend.daos.IdeasDao;
import org.academiadecodigo.hackathonbackend.models.Idea;
import org.academiadecodigo.hackathonbackend.models.Mood;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class IdeasDaoMock implements IdeasDao {

    private final List<Idea> allIdeas;
    private int totalIdeas;

    public IdeasDaoMock() {
        allIdeas = new LinkedList<>();
        populateIdeas();
    }

    private void populateIdeas(){
        newIdea("Tie your grandma to a chair", "You might need a chair, and a lot of cello tape", Mood.EVIL_GENIUS);
        newIdea("Check up on your friend that lives alone", "Mental health is important!", Mood.GOOD_HEART);
        newIdea("Jump into an ice-cold lake", "Benefits might include boosted immunity", Mood.ADVENTURE);
        newIdea("Read the book that is on your bookshelf", "We all know it's been left untouched for way too long", Mood.NORMAL);
        newIdea("Play fetch with the dog but hide the toy behind you", "Isn't it great seeing their faces of confusion when you do this?", Mood.EVIL_GENIUS);
        newIdea("Pick up trash from the sidewalk", "Those damn kids!", Mood.GOOD_HEART);
        newIdea("Go to the tallest point of your city", "That might be a mountain to hike, a new landmark to discover or just a friend of yours that's really tall", Mood.ADVENTURE);
        newIdea("Clean all the dishes", "They have been piling up, the time to do it is now!", Mood.NORMAL);

        newIdea("Send your best meme about bears to NASA and wait for their invite to their next mission", "Maybe they're needing someone adventurous, that can think beyond what they have already achieved. And clearly you're the right person for that", Mood.ADVENTURE);
        newIdea("Interrogate your grandma about what is a primary key", "Maybe a drawing will help", Mood.EVIL_GENIUS);
        newIdea("Buy a van and go on a trip for 69 days", "Who says you don't have enough money? Save it well and enjoy a great trip!", Mood.ADVENTURE);
        newIdea("Do a Hackathon for 36 hours", "doing an application in a limited time-frame with a team is an one-time experience, where you creativity bubbles.", Mood.ADVENTURE);
        newIdea("Become a Internet meme", "Try reddit or 9GAG", Mood.ADVENTURE);
        newIdea("Offer your help to construct a home for homeless people", "The best way to feel good is by helping others that need more than us", Mood.GOOD_HEART);
        newIdea("Give a shower to a monkey", "What do you mean you never done it before yet?", Mood.GOOD_HEART);
        newIdea("Live like a hermit for a hour", "put the tech to a side, contact with no one, don't even read a book. Just be with yourself for 60 minutes.", Mood.ADVENTURE);
        newIdea("Adopt an unicorn", "or any other pet if you can't find one", Mood.ADVENTURE);
        newIdea("Taste Korean Food", "The closest Korean restaurant is 2 miles away", Mood.NORMAL);
        newIdea("Paint a wall", "Choose a design of your preference, buy some pencils and give wings to your imagination! Don't think about getting it perfect. Just get it done.", Mood.NORMAL);
    }

    public void newIdea(String title, String description, Mood mood) {

        totalIdeas++;
        Idea idea = new Idea.IdeaBuilder()
                .setId(totalIdeas)
                .setTitle(title)
                .setDescription(description)
                .setMood(mood)
                .build();
        allIdeas.add(idea);
    }

    public List<Idea> getAllIdeas() {
        return allIdeas;
    }

    @Override
    public void delete(Idea idea) {
        allIdeas.remove(idea);
    }
}
