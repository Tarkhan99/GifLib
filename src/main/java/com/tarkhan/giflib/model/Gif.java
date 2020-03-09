package com.tarkhan.giflib.model;

import java.time.LocalDate;

public class Gif {

    private String name;
    private LocalDate dateUploaded;
    private String username;
    private boolean favourite;
    private int categoryId;

    public Gif(String name, LocalDate dateUploaded, String username, boolean favourite, int categoryId) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.username = username;
        this.favourite = favourite;
        this.categoryId = categoryId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }
}
