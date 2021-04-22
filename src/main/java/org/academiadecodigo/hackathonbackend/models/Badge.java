package org.academiadecodigo.hackathonbackend.models;

import java.util.Objects;

public class Badge {

    private Integer id;
    private String title;
    private String description;

    public Badge() {}

    public Badge(BadgeBuilder badgeBuilder) {
        this.id = badgeBuilder.getId();
        this.title = badgeBuilder.getTitle();
        this.description = badgeBuilder.getDescription();
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static class BadgeBuilder {

        private int id;
        private String title;
        private String description;

        public int getId() {
            return id;
        }

        public BadgeBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public String getTitle() {
            return title;
        }

        public BadgeBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public BadgeBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Badge build() {
            return new Badge(this);
        }
    }
}
