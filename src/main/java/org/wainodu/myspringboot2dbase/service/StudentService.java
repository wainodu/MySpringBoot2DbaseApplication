package org.wainodu.myspringboot2dbase.service;

import org.springframework.stereotype.Service;
import org.wainodu.myspringboot2dbase.entity.Student;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}
