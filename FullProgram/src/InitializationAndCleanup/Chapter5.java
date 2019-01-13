package InitializationAndCleanup;
import InitializationAndCleanup.exercise12.Exercise12;
import InitializationAndCleanup.exercise4.Exercise4;
import InitializationAndCleanup.exercise8.Exercise8;
import InitializationAndCleanup.exercise16.Exercise16;
import InitializationAndCleanup.exercise20.Exercise20;
import com.company.Chapter;
import com.company.ChapterEnum;
import com.company.Exercise;
import java.util.LinkedHashMap;

public class Chapter5 extends Chapter {
    private String name = ChapterEnum.CHAPTER5.getChapterName();

    @Override
    protected LinkedHashMap<Integer, Exercise> listOfExerciseInit () {
        exerciseList.put(4, new Exercise4());
        exerciseList.put(8, new Exercise8());
        exerciseList.put(12, new Exercise12());
        exerciseList.put(16, new Exercise16());
        exerciseList.put(20, new Exercise20());
        return exerciseList;

    }

}
