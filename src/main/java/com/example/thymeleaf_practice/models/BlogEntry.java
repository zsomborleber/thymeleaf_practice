package com.example.thymeleaf_practice.models;

import java.time.LocalDate;


public class BlogEntry {


    private Integer id;

    private String title;

    private String content;

    private String category;

    private int rating;

    private boolean published;

    private LocalDate create;


    public BlogEntry(String title, String content, String category, int rating, boolean published, LocalDate create) {
        this.title = title;
        this.content = content;
        this.category = category;
        this.rating = rating;
        this.published = published;
        this.create = create;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public LocalDate getCreate() {
        return create;
    }

    public void setCreate(LocalDate create) {
        this.create = create;
    }

    public BlogEntry() {
    }

    public BlogEntry(int id, String title, String content, String category, int rating, boolean published, LocalDate create) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.category = category;
        this.rating = rating;
        this.published = published;
        this.create = create;
    }

    @Override
    public String toString() {
        return "BlogEntry{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", category='" + category + '\'' +
                ", rating=" + rating +
                ", published=" + published +
                ", create=" + create +
                '}';
    }
}
