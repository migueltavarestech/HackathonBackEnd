package org.academiadecodigo.hackathonbackend.models;

import java.util.Objects;

public class Idea {

    private final int id;
    private final String title;
    private final String description;
    private final Mood mood;

    private Idea(IdeaBuilder ideaBuilder) {
        this.id = ideaBuilder.getId();
        this.title = ideaBuilder.getTitle();
        this.description = ideaBuilder.getDescription();
        this.mood = ideaBuilder.getMood();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Mood getMood() {
        return mood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Idea idea = (Idea) o;
        return id == idea.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static class IdeaBuilder {

        private int id;
        private String title;
        private String description;
        private Mood mood;

        public int getId() {
            return id;
        }

        public IdeaBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public String getTitle() {
            return title;
        }

        public IdeaBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public IdeaBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Mood getMood() {
            return mood;
        }

        public IdeaBuilder setMood(Mood mood) {
            this.mood = mood;
            return this;
        }

        public Idea build() {
            return new Idea(this);
        }
    }
}
