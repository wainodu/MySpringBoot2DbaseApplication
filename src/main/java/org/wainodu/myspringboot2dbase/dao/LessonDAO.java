package org.wainodu.myspringboot2dbase.dao;

import org.springframework.stereotype.Repository;
import org.wainodu.myspringboot2dbase.entity.Lesson;


import java.util.List;

@Repository
public interface LessonDAO {
    List<Lesson> getAllLessons();
    Lesson saveLesson(Lesson lesson);
    Lesson getLesson(int id);
    void deleteLesson(int id);
}
