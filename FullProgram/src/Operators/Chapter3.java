package Operators;
import Operators.exercise12.Exercise12;
import Operators.exercise4.Exercise4;
import Operators.exercise8.Exercise8;
import com.company.Chapter;
import com.company.ChapterEnum;
import com.company.Exercise;
import java.util.LinkedHashMap;

public class Chapter3 extends Chapter {
    private String name = ChapterEnum.CHAPTER3.getChapterName();

    @Override
    protected LinkedHashMap<Integer, Exercise> listOfExerciseInit () {
        exerciseList.put(4, new Exercise4());
        exerciseList.put(8, new Exercise8());
        exerciseList.put(12, new Exercise12());

        return exerciseList;
    }

}
