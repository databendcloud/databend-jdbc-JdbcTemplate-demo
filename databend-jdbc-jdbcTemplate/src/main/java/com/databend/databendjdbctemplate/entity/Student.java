package com.databend.databendjdbctemplate.entity;

import com.databend.databendjdbctemplate.util.SnowFlake;
import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
public class Student {
    private static final long serialVersionUID = 1L;
    private String id = String.valueOf(SnowFlake.getInstance().nextId());
    private String name;
    private Integer age;
}
