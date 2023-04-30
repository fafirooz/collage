package ir.fa.collage.repository;

import ir.fa.collage.model.Lesson;

import java.util.ArrayList;

public class LessonRepository {

    private ArrayList lessonList;

    public LessonRepository() {
        lessonList = new ArrayList();
    }

    public void save(Lesson lesson) {
        lessonList.add(lesson);
    }
}
