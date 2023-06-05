package com.andre.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andre.crudspring.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
