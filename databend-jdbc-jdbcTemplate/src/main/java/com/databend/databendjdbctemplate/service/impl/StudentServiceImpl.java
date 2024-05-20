package com.databend.databendjdbctemplate.service.impl;

import com.databend.databendjdbctemplate.dao.StudentDao;
import com.databend.databendjdbctemplate.entity.Student;
import com.databend.databendjdbctemplate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;

    @Override
    public List<Map<String, Object>> index() {
        return studentDao.list();
    }

    @Override
    public Integer save(Student student) {
        return studentDao.save(student);
    }
}
