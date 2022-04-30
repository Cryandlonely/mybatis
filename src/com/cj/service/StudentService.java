package com.cj.service;

import com.cj.domain.Student;

public interface StudentService {
    public Student getById(String id);
    public void save(Student student);
}
