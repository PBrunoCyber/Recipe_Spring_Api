package com.example.recipe_api_spring.Recipe;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Recipe {
    @Id
    @SequenceGenerator(name = "recipe_sequence", sequenceName = "recipe_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recipe_sequence")
    private Long id;
    private String name;
    private String totalTime;
    private double rating;
    @Column(columnDefinition = "TEXT")
    private String image;
    @Column(columnDefinition = "TEXT")
    private String description;

    public Recipe() {
    }

    public Recipe(String name, double rating, String totalTime, String image, String description) {
        this.name = name;
        this.rating = rating;
        this.totalTime = totalTime;
        this.image = image;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Recipe{" + " id= " + id + ", name= " + name + ", totalTime = " + totalTime + ", rating = " + rating
                + ", description = " + description + ", image" + image + "}";
    }

}
