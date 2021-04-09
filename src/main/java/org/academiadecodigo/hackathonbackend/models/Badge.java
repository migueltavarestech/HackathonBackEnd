package org.academiadecodigo.hackathonbackend.models;

import java.util.Objects;

public class Badge {

    private Integer id;
    private String title;
    private String description;

    private Badge(BadgeBuilder badgeBuilder) {
        this.id = badgeBuilder.getId();
        this.title = badgeBuilder.getTitle();
        this.description = badgeBuilder.getDescription();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Badge badge = (Badge) o;
        return id.equals(badge.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
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
