package ControllingExecution;
import ControllingExecution.exercise16.Exercise16;
import ControllingExecution.exercise20.Exercise20;
import ControllingExecution.exercise24.Exercise24;
import com.company.Chapter;
import com.company.ChapterEnum;
import com.company.Exercise;
import java.util.LinkedHashMap;

public class Chapter4 extends Chapter {
    private String name = ChapterEnum.CHAPTER3.getChapterName();

    @Override
    protected LinkedHashMap<Integer, Exercise> listOfExerciseInit () {
        exerciseList.put(16, new Exercise16());
        exerciseList.put(20, new Exercise20());
        exerciseList.put(24, new Exercise24());
        return exerciseList;
    }

}
