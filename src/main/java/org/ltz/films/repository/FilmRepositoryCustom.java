package org.ltz.films.repository;

import org.ltz.films.entity.Film;

public interface FilmRepositoryCustom {

    Film findByIdWithCategories(Long filmId);
}
