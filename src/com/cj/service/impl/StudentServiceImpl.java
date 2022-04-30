package com.cj.service.impl;

import com.cj.dao.Impl.StudentDaoImpl;
import com.cj.dao.StudentDao;
import com.cj.domain.Student;
import com.cj.service.StudentService;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao = new StudentDaoImpl();

    @Override
    public Student getById(String id) {
        Student s = studentDao.getById(id);
        return s;
    }

    @Override
    public void save(Student student) {
        studentDao.save(student);
    }
}
