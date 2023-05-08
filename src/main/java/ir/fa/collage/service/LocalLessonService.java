package ir.fa.collage.service;

import ir.fa.collage.model.Lesson;
import ir.fa.collage.repository.LessonRepository;

public class LocalLessonService implements LessonService {

    private LessonRepository lessonRepository;

    public LocalLessonService(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    @Override
    public void save(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    @Override
    public void remove(Lesson lesson) {
        lessonRepository.remove(lesson);
    }
}
