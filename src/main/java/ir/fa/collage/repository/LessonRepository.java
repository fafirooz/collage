package ir.fa.collage.repository;

import ir.fa.collage.model.Field;
import ir.fa.collage.model.Lesson;

import java.util.ArrayList;

public interface LessonRepository {
    public void save(Lesson lesson);
    public void remove(Lesson lesson);
    public ArrayList<Lesson> returnList();
}
