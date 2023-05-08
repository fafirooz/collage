package ir.fa.collage.service;

import ir.fa.collage.model.Field;
import ir.fa.collage.model.Lesson;

import java.util.ArrayList;

public interface LessonService {

    void save(Lesson lesson);
    void remove(Lesson lesson);
    ArrayList returnList();
}
