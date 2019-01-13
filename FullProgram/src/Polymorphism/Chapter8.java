package Polymorphism;
import Polymorphism.exercise4.Exercise4;
import Polymorphism.exercise8.Exercise8;
import Polymorphism.exercise12.Exercise12;
import Polymorphism.exercise16.Exercise16;
import com.company.Chapter;
import com.company.ChapterEnum;
import com.company.Exercise;
import java.util.LinkedHashMap;

public class Chapter8 extends Chapter {
    private String name = ChapterEnum.CHAPTER8.getChapterName();

    @Override
    protected LinkedHashMap<Integer, Exercise> listOfExerciseInit () {
        exerciseList.put(4, new Exercise4());
        exerciseList.put(8, new Exercise8());
        exerciseList.put(12, new Exercise12());
        exerciseList.put(16, new Exercise16());
        return exerciseList;
    }

}
