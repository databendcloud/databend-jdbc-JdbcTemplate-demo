package com.databend.databendjdbctemplate.service;

import com.databend.databendjdbctemplate.entity.Student;

import java.util.List;
import java.util.Map;


public interface StudentService {
    List<Map<String, Object>> index();
    Integer save(Student student);
}
