package com.ead.course.course.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ead.course.course.repositories.LessonRepository;
import com.ead.course.course.services.LessonService;

@Service
public class LessonServiceImpl implements LessonService {

  @Autowired
  LessonRepository lessonRepository;
}
