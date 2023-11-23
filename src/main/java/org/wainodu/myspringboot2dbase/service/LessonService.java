package org.wainodu.myspringboot2dbase.service;

import org.springframework.stereotype.Service;
import org.wainodu.myspringboot2dbase.entity.Lesson;


import java.util.List;

@Service
public interface LessonService {
    List<Lesson> getAllLessons();

    Lesson saveLesson(Lesson lesson);

    Lesson getLesson(int id);

    void deleteLesson(int id);
}
