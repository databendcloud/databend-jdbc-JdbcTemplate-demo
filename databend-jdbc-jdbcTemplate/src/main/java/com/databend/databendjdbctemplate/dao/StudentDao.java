package com.databend.databendjdbctemplate.dao;

import com.databend.databendjdbctemplate.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Repository
public class StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> list() {
//        List<Student> list = jdbcTemplate.query("select * from student", new Object[]{}, new BeanPropertyRowMapper(Student.class));
        List<Object> param = new ArrayList<>();
//        param.add(11);
        param.add(null);
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from student where age = ?", param.toArray());
        if (list != null && list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }

    public int save(Student student) {
        return jdbcTemplate.update("insert into student(id, name, age) values(?, ?, ?)", student.getId(), student.getName(), student.getAge());
    }

}
