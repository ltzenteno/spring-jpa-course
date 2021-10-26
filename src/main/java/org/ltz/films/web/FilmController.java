package org.ltz.films.web;

import lombok.RequiredArgsConstructor;
import org.ltz.films.entity.Film;
import org.ltz.films.repository.FilmRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("films")
public class FilmController {

    private final Logger logger = LoggerFactory.getLogger(FilmController.class);

    private FilmRepository filmRepository;  // TODO: replace for a service

    @GetMapping
    public ResponseEntity<?> test() {
        System.out.println("hola");
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("hello world");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Film> fetchFilm(@PathVariable Long id) {

        // TODO: return dto
        Film film = this.filmRepository.findByIdWithCategories(id);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(film);
    }
}
