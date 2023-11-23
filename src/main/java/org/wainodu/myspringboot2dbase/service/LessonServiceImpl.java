package org.wainodu.myspringboot2dbase.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wainodu.myspringboot2dbase.dao.LessonDAO;

import org.wainodu.myspringboot2dbase.entity.Lesson;


import java.util.List;

@Service
public class LessonServiceImpl implements LessonService {
    @Autowired
    private LessonDAO lessonDAO;

    @Override
    @Transactional
    public List<Lesson> getAllLessons() {
        return lessonDAO.getAllLessons();
    }

    @Override
    @Transactional
    public Lesson saveLesson(Lesson student) {
        return lessonDAO.saveLesson(student);
    }

    @Override
    @Transactional
    public Lesson getLesson(int id) {
        return lessonDAO.getLesson(id);
    }

    @Override
    @Transactional
    public void deleteLesson(int id) {
        lessonDAO.deleteLesson(id);
    }
}
