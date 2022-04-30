package com.cj.dao.Impl;

import com.cj.dao.StudentDao;
import com.cj.domain.Student;
import com.cj.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class StudentDaoImpl implements StudentDao {
    @Override
    public Student getById(String id) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        Student ss = session.selectOne("test.getById","001");
        return ss;
    }

    @Override
    public void save(Student student) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        Student ss = session.selectOne("test.save",student);
    }
}
