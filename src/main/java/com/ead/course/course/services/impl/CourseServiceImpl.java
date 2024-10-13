package com.ead.course.course.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ead.course.course.repositories.CourseRepository;
import com.ead.course.course.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

  @Autowired
  CourseRepository courseRepository;
}
