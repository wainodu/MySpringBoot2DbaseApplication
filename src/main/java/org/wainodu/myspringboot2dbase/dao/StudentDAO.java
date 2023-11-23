package org.wainodu.myspringboot2dbase.dao;

import org.springframework.stereotype.Repository;
import org.wainodu.myspringboot2dbase.entity.Student;

import java.util.List;

@Repository
public interface StudentDAO {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudent(int id);
    void deleteStudent(int id);
}
