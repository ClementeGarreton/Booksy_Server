package com.example.booksy.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<RemoteBookDto> getCatalog() {
        return Arrays.asList(
                new RemoteBookDto(
                        "El Hobbit",
                        "J. R. R. Tolkien",
                        "https://picsum.photos/seed/hobbit/400/600"),
                new RemoteBookDto(
                        "1984",
                        "George Orwell",
                        "https://picsum.photos/seed/1984/400/600"),
                new RemoteBookDto(
                        "Dune",
                        "Frank Herbert",
                        "https://picsum.photos/seed/dune/400/600"),
                new RemoteBookDto(
                        "Fahrenheit 451",
                        "Ray Bradbury",
                        "https://picsum.photos/seed/f451/400/600"));
    }
}
