package ir.fa.collage;

import ir.fa.collage.model.Field;
import ir.fa.collage.model.Lesson;
import ir.fa.collage.repository.InMemoryLessonRepository;
import ir.fa.collage.repository.LessonRepository;
import ir.fa.collage.service.LessonService;
import ir.fa.collage.ui.TerminalUI;
import ir.fa.collage.ui.UI;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        LessonRepository lessonRepository = new InMemoryLessonRepository();
        LessonService lessonService = new LessonService(lessonRepository);
        UI ui = new TerminalUI(lessonService);
        ui.show();
    }
}
