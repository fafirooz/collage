package ir.fa.collage.repository;

import ir.fa.collage.model.Lesson;

public interface LessonRepository {
    public void save(Lesson lesson);
    public void remove(Lesson lesson);
}
