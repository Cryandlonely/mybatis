package com.cj.dao;

import com.cj.domain.Student;

public interface StudentDao {
    public Student getById(String id);

    public void save(Student student);
}
