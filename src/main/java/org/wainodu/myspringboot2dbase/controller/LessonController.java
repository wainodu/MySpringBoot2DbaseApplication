package org.wainodu.myspringboot2dbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.wainodu.myspringboot2dbase.entity.Lesson;

import org.wainodu.myspringboot2dbase.service.LessonService;


import java.util.List;

@RestController
@RequestMapping("/api")
public class LessonController {
    @Autowired
    private LessonService lessonService;

    @GetMapping("/lessons")
    public ResponseEntity allLessons() {
        try {
            List<Lesson> allLessons = lessonService.getAllLessons();
            return new ResponseEntity(allLessons, HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(400));
        }
    }

    @GetMapping("/lessons/{id}")
    public ResponseEntity getLesson(@PathVariable("id") int id) {
        try {
            return new ResponseEntity(lessonService.getLesson(id), HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(400));
        }
    }

    @PostMapping("/lessons")
    public ResponseEntity saveLesson(@RequestBody Lesson lesson) {
        try {
            return new ResponseEntity(lessonService.saveLesson(lesson), HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(400));
        }
    }

    @PutMapping("/lessons")
    public ResponseEntity updateLesson(@RequestBody Lesson lesson) {
        lessonService.saveLesson(lesson);
        try {
            return new ResponseEntity(lesson, HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(400));
        }

    }

    @DeleteMapping("/lessons/{id}")
    public ResponseEntity deleteLesson(@PathVariable("id") int id) {
        lessonService.deleteLesson(id);
        try {
            return new ResponseEntity(HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatusCode.valueOf(400));
        }
    }
}
