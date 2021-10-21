package org.ltz.repository;

import org.ltz.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepositoryImpl implements CourseRepositoryCustom {

    @Autowired
    EntityManager em;

    @Override
    public List<Course> findAllWithSpecialCase() {
        return new ArrayList<>();
    }
}
