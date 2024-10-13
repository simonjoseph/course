package com.ead.course.course.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ead.course.course.repositories.ModuleRepository;
import com.ead.course.course.services.ModuleService;

@Service
public class ModuleServiceImpl implements ModuleService {

  @Autowired
  ModuleRepository moduleRepository;
}
