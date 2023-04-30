package ir.fa.collage.service;

import ir.fa.collage.model.Lesson;
import ir.fa.collage.repository.LessonRepository;

public class LessonService {

    private LessonRepository lessonRepository;

    public LessonService() {
        lessonRepository = new LessonRepository();
    }

    public void save(Lesson lesson) {
        lessonRepository.save(lesson);
    }
}
