package com.ead.course.course.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ead.course.course.models.ModuleModel;

public interface ModuleRepository extends JpaRepository<ModuleModel, UUID> {
  boolean existsByTitle(String title);
}
