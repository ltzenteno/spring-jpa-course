package org.ltz;

import org.ltz.entity.Course;
import org.ltz.repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaCourseApplication implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger(JpaCourseApplication.class);

	@Autowired
	private CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaCourseApplication.class, args);
	}

	public void run(String ...arg0) throws Exception {
		Course course = this.courseRepository.findById(1L);

		logger.info("Course 1 => {}", course);
	}
}
