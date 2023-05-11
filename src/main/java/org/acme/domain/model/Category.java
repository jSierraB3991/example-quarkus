package org.acme.domain.model;

import java.util.UUID;

public class Category {

    private String id;
    private String name;
    private String description;
    private String imageUrl;

    public Category(String name, String description, String imageUrl) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
