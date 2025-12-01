package com.example.booksy.demo;

public class RemoteBookDto {

    private String title;
    private String author;
    private String imageUrl;
    private String genre;

    public RemoteBookDto(String title, String author, String imageUrl, String genre) {
        this.title = title;
        this.author = author;
        this.imageUrl = imageUrl;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getGenre() {
        return genre;
    }
}