package ir.fa.collage.repository;

import ir.fa.collage.model.Field;
import ir.fa.collage.model.Lesson;

import java.util.ArrayList;

public class InMemoryLessonRepository implements LessonRepository {

    private ArrayList<Lesson> lessonList;//= new ArrayList<>();
    //ArrayList<Field> lessonlist= new ArrayList<>();

    public InMemoryLessonRepository() {
        lessonList = new ArrayList();
    }

    @Override
    public void save(Lesson lesson) {
        lessonList.add(lesson);
    }

    @Override
    public void remove(Lesson lesson) {
        lessonList.remove(lesson);
    }
    @Override
    public ArrayList<Lesson> returnList() {
        return lessonList;
    }


}
