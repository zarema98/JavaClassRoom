package com.company;
import java.util.Scanner;
public class Main {
    private static final Scanner in = new Scanner(System.in);
    public static  String[] comLineArgs;
    public static void main(String... args) {
        comLineArgs = args;
        System.out.println("Халилова Зарема");
        System.out.println("====================================================================");
        Chapter.getChapters();
        System.out.println("====================================================================");
        System.out.print("Выберите номер главы из списка " + '\u2191' + " : ");
        int chapterNumber = in.nextInt();
        System.out.println("====================================================================");
        try {
            Chapter chapter = Chapter.getCurrentChapter(chapterNumber);
            chapter.listOfExercise();
            System.out.println("====================================================================");
            System.out.print("Выберите номер задания: ");
            int exerciseNumber = in.nextInt();
            System.out.println("====================================================================");
            try {
                chapter.getExercise(exerciseNumber);
            } catch (NullPointerException npe) {
                System.out.println("Ошибка!!! Такого задания нет.");
            }
        } catch (ChapterException fe) {
            System.out.println(fe.toString());
        }
    }
}
