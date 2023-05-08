package ir.fa.collage.ui;

import ir.fa.collage.model.Field;
import ir.fa.collage.model.Lesson;

import java.util.ArrayList;
import java.util.Scanner;

public class TerminalUI implements Ui {

    private static ir.fa.collage.service.LocalLessonService lessonService;
    Scanner scanner = new Scanner(System.in);
    ArrayList<Lesson> database = new ArrayList<>();


    public TerminalUI(ir.fa.collage.service.LocalLessonService lessonService) {
        this.lessonService = lessonService;
    }

    @Override
    public void show() {
        System.out.println("Welcome to the Collage application");
        System.out.println("Please select one option by number:");
        Scanner scanner = new Scanner(System.in);

        int input = -1;
        do {
            welcome();
            input = scanner.nextInt();
            switch(input){
                case 1:
                    saveLesson(scanner, database);
                    break;
                case 2:
                    removeLesson(scanner, database);
                    break;
                case 3:
                    showListLesson(scanner);
                default:
            }
        } while (input != 0);

    }
    private void welcome(){
        System.out.println("1 - Save lesson:");
        System.out.println("2- remove lesson");
        System.out.println("3- showListLesson");
        System.out.println("0 - Exit");
    }

    private void saveLesson(Scanner scanner, ArrayList<Lesson>arrayList){
        System.out.println("enter name:");
        String name = scanner.next();
        System.out.println("enter term count");
        int termCount = scanner.nextInt();
        Lesson lesson = new Lesson(Field.valueOf(name), termCount);
        lessonService.save(lesson);

    }
    private void removeLesson(Scanner scanner, ArrayList<Lesson>arrayList){
        System.out.println("enter name");
        String name= scanner.next();
        System.out.println("enter term count");
        int termCount = scanner.nextInt();
        Lesson lesson = new Lesson(Field.valueOf(name), termCount);
        lessonService.remove(lesson);
    }
    private void showListLesson(Scanner scanner){
        for (Lesson lesson : lessonService.returnList()) {
            System.out.println(lesson);
        }
    }
}
