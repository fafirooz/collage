package ir.fa.collage;

import ir.fa.collage.model.Field;
import ir.fa.collage.model.Lesson;
import ir.fa.collage.service.LessonService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        LessonService lessonService = new LessonService();

        System.out.println("Welcome to the Collage application");
        System.out.println("Please select one option by number:");
        Scanner scanner = new Scanner(System.in);

        int input = -1;
        do {
            System.out.println("1 - Save lesson:");
            System.out.println("0 - Exit");
            input = scanner.nextInt();
        } while (input != 1 && input != 0 );

        if (input == 1) {
            System.out.println("enter name:");
            String name = scanner.next();
            System.out.println("enter term count");
            int termCount = scanner.nextInt();
            Lesson lesson = new Lesson(Field.valueOf(name), termCount);
            lessonService.save(lesson);
        } else if (input == 0) {
            System.exit(0);
        }
    }
}
