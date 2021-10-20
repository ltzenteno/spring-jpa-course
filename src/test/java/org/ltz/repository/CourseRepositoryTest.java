package org.ltz.repository;

import org.junit.jupiter.api.Test;
import org.ltz.JpaCourseApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = JpaCourseApplication.class)
class CourseRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(CourseRepositoryTest.class);

    @Test
    void contextLoads() {
        logger.info("context is running");
    }
}
