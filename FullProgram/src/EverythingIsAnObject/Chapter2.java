package EverythingIsAnObject;

import EverythingIsAnObject.exercise1.Exercise1;
import EverythingIsAnObject.exercise10.Exercise10;
import EverythingIsAnObject.exercise11.Exercise11;
import EverythingIsAnObject.exercise12.com.Exercise12;
import EverythingIsAnObject.exercise13.Exercise13;
import EverythingIsAnObject.exercise14.Exercise14;
import EverythingIsAnObject.exercise15.Exercise15;
import EverythingIsAnObject.exercise16.Exercise16;
import EverythingIsAnObject.exercise2.Exercise2;
import EverythingIsAnObject.exercise3.Exercise3;
import EverythingIsAnObject.exercise4.Exercise4;
import EverythingIsAnObject.exercise5.Exercise5;
import EverythingIsAnObject.exercise6.Exercise6;
import EverythingIsAnObject.exercise7.Exercise7;
import EverythingIsAnObject.exercise8.Exercise8;
import EverythingIsAnObject.exercise9.Exercise9;
import com.company.Chapter;
import com.company.ChapterEnum;
import com.company.Exercise;
import java.util.LinkedHashMap;

public class Chapter2 extends Chapter {
    private String name = ChapterEnum.CHAPTER2.getChapterName();

    @Override
    protected LinkedHashMap<Integer, Exercise> listOfExerciseInit () {
       exerciseList.put(1, new Exercise1());
       exerciseList.put(2, new Exercise2());
       exerciseList.put(3, new Exercise3());
       exerciseList.put(4, new Exercise4());
       exerciseList.put(5, new Exercise5());
       exerciseList.put(6, new Exercise6());
       exerciseList.put(7, new Exercise7());
       exerciseList.put(8, new Exercise8());
       exerciseList.put(9, new Exercise9());
       exerciseList.put(10, new Exercise10());
       exerciseList.put(11, new Exercise11());
       exerciseList.put(12, new Exercise12());
       exerciseList.put(13, new Exercise13());
       exerciseList.put(14, new Exercise14());
       exerciseList.put(15, new Exercise15());
       exerciseList.put(16, new Exercise16());

       return exerciseList;

   }


}
