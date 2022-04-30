package com.test;

import com.cj.domain.Student;
import com.cj.service.StudentService;
import com.cj.service.impl.StudentServiceImpl;
import com.cj.utils.ServiceFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        StudentService service = (StudentService) ServiceFactory.getService(new StudentServiceImpl());
        /*Student s = service.getById("001");
        System.out.println(s);*/
        Student student = new Student();
        student.setId("498416352");
        student.setName("dawdawdawdaw");
        student.setAge("298435");
        service.save(student);
    }
}
