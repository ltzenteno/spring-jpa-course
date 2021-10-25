package org.ltz.courses.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.ltz.JpaCourseApplication;
import org.ltz.courses.entity.Course;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest(classes = JpaCourseApplication.class)
class CourseRepositoryTest {

    private final Logger logger = LoggerFactory.getLogger(CourseRepositoryTest.class);

    @Autowired
    private CourseRepository courseRepository;

    @Test
    void findById_basic_test_case() {
        Optional<Course> optionalCourse = this.courseRepository.findById(1L);

        Assertions.assertEquals("JPA course", optionalCourse.get().getName());
    }
}
