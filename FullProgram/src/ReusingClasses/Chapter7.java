package ReusingClasses;
import ReusingClasses.exercise4.Exercise4;
import ReusingClasses.exercise8.Exercise8;
import ReusingClasses.exercise12.Exercise12;
import ReusingClasses.exercise16.Exercise16;
import ReusingClasses.exercise20.Exercise20;
import ReusingClasses.exercise24.Exercise24;
import com.company.Chapter;
import com.company.ChapterEnum;
import com.company.Exercise;
import java.util.LinkedHashMap;

public class Chapter7 extends Chapter {
    private String name = ChapterEnum.CHAPTER7.getChapterName();

    @Override
    protected LinkedHashMap<Integer, Exercise> listOfExerciseInit () {
        exerciseList.put(4, new Exercise4());
        exerciseList.put(8, new Exercise8());
        exerciseList.put(12, new Exercise12());
        exerciseList.put(16, new Exercise16());
        exerciseList.put(20, new Exercise20());
        exerciseList.put(24, new Exercise24());

        return exerciseList;
    }

}
