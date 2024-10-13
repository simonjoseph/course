package com.ead.course.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ead.course.course.models.CourseModel;
import java.util.UUID;

public interface CourseRepository extends JpaRepository<CourseModel, UUID> {
  boolean existsByName(String name);
}
