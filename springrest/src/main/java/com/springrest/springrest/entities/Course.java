package com.springrest.springrest.entities;

public class Course {

    private long id;
    private String title;
    private String description;

    public Course(long id, String title, String description) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Course() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
