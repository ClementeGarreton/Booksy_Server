package com.example.booksy.demo;

public class RemoteBookDto {

    private String title;
    private String author;
    private String imageUrl;

    public RemoteBookDto(String title, String author, String imageUrl) {
        this.title = title;
        this.author = author;
        this.imageUrl = imageUrl;
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
}
