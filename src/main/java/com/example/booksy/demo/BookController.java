package com.example.booksy.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class BookController {

        private final List<RemoteBookDto> allBooks = Arrays.asList(
                        // Fantasía
                        new RemoteBookDto(
                                        "El Hobbit",
                                        "J. R. R. Tolkien",
                                        "https://picsum.photos/seed/hobbit/400/600",
                                        "Fantasía"),
                        new RemoteBookDto(
                                        "Harry Potter y la Piedra Filosofal",
                                        "J.K. Rowling",
                                        "https://picsum.photos/seed/harrypotter/400/600",
                                        "Fantasía"),
                        new RemoteBookDto(
                                        "Dune",
                                        "Frank Herbert",
                                        "https://picsum.photos/seed/dune/400/600",
                                        "Ciencia Ficción"),

                        // Terror
                        new RemoteBookDto(
                                        "It",
                                        "Stephen King",
                                        "https://picsum.photos/seed/it/400/600",
                                        "Terror"),
                        new RemoteBookDto(
                                        "Drácula",
                                        "Bram Stoker",
                                        "https://picsum.photos/seed/dracula/400/600",
                                        "Terror"),
                        new RemoteBookDto(
                                        "El Resplandor",
                                        "Stephen King",
                                        "https://picsum.photos/seed/shining/400/600",
                                        "Terror"),

                        // Ciencia Ficción / Distopía
                        new RemoteBookDto(
                                        "1984",
                                        "George Orwell",
                                        "https://picsum.photos/seed/1984/400/600",
                                        "Distopía"),
                        new RemoteBookDto(
                                        "Fahrenheit 451",
                                        "Ray Bradbury",
                                        "https://picsum.photos/seed/f451/400/600",
                                        "Distopía"),

                        // Manga / Cómic
                        new RemoteBookDto(
                                        "Death Note Vol. 1",
                                        "Tsugumi Ohba",
                                        "https://picsum.photos/seed/deathnote/400/600",
                                        "Manga"),

                        // Literatura Experimental
                        new RemoteBookDto(
                                        "Naked Lunch",
                                        "William S. Burroughs",
                                        "https://picsum.photos/seed/nakedlunch/400/600",
                                        "Literatura Experimental"),

                        // Más opciones
                        new RemoteBookDto(
                                        "El Señor de los Anillos",
                                        "J. R. R. Tolkien",
                                        "https://picsum.photos/seed/lotr/400/600",
                                        "Fantasía"),
                        new RemoteBookDto(
                                        "Cien Años de Soledad",
                                        "Gabriel García Márquez",
                                        "https://picsum.photos/seed/cienanos/400/600",
                                        "Realismo Mágico"));

        @GetMapping("/books")
        public List<RemoteBookDto> getCatalog(@RequestParam(required = false) String genre) {
                if (genre == null || genre.isEmpty()) {
                        return allBooks;
                }

                return allBooks.stream()
                                .filter(book -> book.getGenre().equalsIgnoreCase(genre))
                                .collect(Collectors.toList());
        }

        @GetMapping("/books/genres")
        public List<String> getGenres() {
                return allBooks.stream()
                                .map(RemoteBookDto::getGenre)
                                .distinct()
                                .sorted()
                                .collect(Collectors.toList());
        }
}