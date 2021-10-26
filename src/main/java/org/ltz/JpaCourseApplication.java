package org.ltz;

import org.ltz.courses.entity.Course;
import org.ltz.courses.repository.CourseRepository;
import org.ltz.films.entity.Film;
import org.ltz.films.repository.FilmRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JpaCourseApplication implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger(JpaCourseApplication.class);

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private FilmRepository filmRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaCourseApplication.class, args);
	}

	public void run(String ...arg0) throws Exception {
		List<Course> list = this.courseRepository.findAll();
		logger.info("Courses; {}", list);

		Film film = this.filmRepository.findByIdWithCategories(1L);
		logger.info("Film: {}", film);
	}
}
