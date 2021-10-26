package org.ltz.films.repository.impl;

import lombok.AllArgsConstructor;
import org.ltz.films.entity.Film;
import org.ltz.films.entity.FilmCategory;
import org.ltz.films.repository.FilmRepositoryCustom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import java.util.Set;

@AllArgsConstructor
@Repository
public class FilmRepositoryImpl implements FilmRepositoryCustom {

    EntityManager entityManager;

    @Override
    public Film findByIdWithCategories(Long filmId) {
        Film film = this.entityManager.find(Film.class, filmId);

        if (film == null) {
            throw new EntityNotFoundException("film not found");
        }

        Set<FilmCategory> filmCategories = film.getFilmCategories();

        return film;
    }
}
