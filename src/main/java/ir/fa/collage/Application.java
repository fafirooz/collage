package ir.fa.collage;

import ir.fa.collage.repository.InMemoryLessonRepository;
import ir.fa.collage.repository.LessonRepository;
import ir.fa.collage.ui.TerminalUI;
import ir.fa.collage.ui.Ui;

public class Application {
    public static void main(String[] args) {
        LessonRepository lessonRepository = new InMemoryLessonRepository();
        ir.fa.collage.service.LocalLessonService lessonService = new ir.fa.collage.service.LocalLessonService(lessonRepository);
        Ui ui = new TerminalUI(lessonService);
        ui.show();
    }
}
