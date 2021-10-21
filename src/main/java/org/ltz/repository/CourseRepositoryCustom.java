package org.ltz.repository;

import org.ltz.entity.Course;

import java.util.List;

public interface CourseRepositoryCustom {
    public List<Course> findAllWithSpecialCase();
}
