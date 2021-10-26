package org.ltz.films.service;

import org.ltz.films.entity.Film;

public interface FilmService {
    Film findByIdWithCategories(Long id);
}
