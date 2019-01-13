package com.company;

import AccesControl.Chapter6;
import ControllingExecution.Chapter4;
import EverythingIsAnObject.Chapter2;
import InitializationAndCleanup.Chapter5;
import Operators.Chapter3;
import Polymorphism.Chapter8;
import ReusingClasses.Chapter7;

import java.util.LinkedHashMap;

public class Chapter {
    private static ChapterEnum[] chapters = ChapterEnum.values();
    protected LinkedHashMap<Integer, Exercise> exerciseList = new LinkedHashMap<>();


    public static void getChapters() {
        for(ChapterEnum chapter : chapters)
            System.out.println(chapter.getChapterName());
    }

    protected Chapter () {

    }

    public static Chapter getCurrentChapter (int numberOfChapter) throws ChapterException{
        switch (numberOfChapter) {
            case 2: return new Chapter2();
            case 3: return new Chapter3();
            case 4: return new Chapter4();
            case 5: return new Chapter5();
            case 6: return new Chapter6();
            case 7: return new Chapter7();
            case 8: return new Chapter8();
            default: throw new ChapterException("Ошибка!!! Главы " + numberOfChapter + " нет в списке.");
        }
    }

    protected LinkedHashMap<Integer, Exercise> listOfExerciseInit () {
        return exerciseList;
    }

    protected  void listOfExercise () {
        exerciseList = listOfExerciseInit();
        for(Exercise exercise : exerciseList.values()) {
            exercise.exerciseName();
            exercise.getDescription();
            System.out.println();
        }
    }

    public void getExercise(int exerciseNumber) {
        exerciseList.get(exerciseNumber).exerciseName();
        System.out.println();
        exerciseList.get(exerciseNumber).getDescription();
        System.out.println();
        exerciseList.get(exerciseNumber).getCode();
        System.out.println();
        exerciseList.get(exerciseNumber).getResult();
    }
}
