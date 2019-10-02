package com.gekif.review;

import com.gekif.core.BaseEntity;
import com.gekif.course.Course;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity
public class Review extends BaseEntity {
    private int rating;
    private String description;

    @ManyToOne
    private Course course;

    // TODO:csd - We are duplication code here for every single entity. Share it?
    protected Review() {
       super();
    }

    public Review(int rating, String description) {
        this.rating = rating;
        this.description = description;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
