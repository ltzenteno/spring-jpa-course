package org.ltz.films.service.impl;

import lombok.AllArgsConstructor;
import org.ltz.films.entity.Film;
import org.ltz.films.entity.FilmCategory;
import org.ltz.films.repository.FilmRepository;
import org.ltz.films.service.FilmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Set;

@AllArgsConstructor
@Service
public class FilmServiceImpl implements FilmService {

    private final Logger logger = LoggerFactory.getLogger(FilmServiceImpl.class);

    FilmRepository filmRepository;

    @Override
    public Film findByIdWithCategories(Long id) {

        Film entity = this.filmRepository.findByIdWithCategories(id);

        logger.info("filmId: {}", entity.getId());

        Set<FilmCategory> filmCategories = entity.getFilmCategories();
        // TODO usar entityManager para tener Session y asi poder ir por los relations lazy
        filmCategories.forEach(System.out::println);

        return entity;
    }
}
