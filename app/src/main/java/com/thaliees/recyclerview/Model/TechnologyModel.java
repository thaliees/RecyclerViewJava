package com.thaliees.recyclerview.Model;

public class TechnologyModel {
    public String image;
    public String name;
    public String description;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TechnologyModel(String image, String name, String description) {
        this.image = image;
        this.name = name;
        this.description = description;
    }
}
