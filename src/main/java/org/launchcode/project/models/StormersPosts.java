package org.launchcode.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StormersPosts {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String description;
    private String postCategory;


    public StormersPosts(String name, String description, String postCategory) {
        this.name = name;
        this.description = description;
        this.postCategory = postCategory;

    }

    public StormersPosts() {
    }

    public int getId() {
        return id;
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

    public String getPostCategory() {
        return postCategory;
    }

    public void setPostCategory(String postCategory) {
        this.postCategory = postCategory;
    }
    @Override
    public String toString() {
        return name;
    }



}
