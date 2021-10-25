package org.ltz.courses.repository;

import org.ltz.courses.entity.Course;

import java.util.List;

public interface CourseRepositoryCustom {
    public List<Course> findAllWithSpecialCase();
}
