package org.ltz.films.repository;

import org.ltz.films.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long>, FilmRepositoryCustom {
}
