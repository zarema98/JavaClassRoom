package AccesControl;
import AccesControl.exercise4.com.company.Exercise4;
import AccesControl.exercise8.Exercise8;
import com.company.Chapter;
import com.company.ChapterEnum;
import com.company.Exercise;
import java.util.LinkedHashMap;

public class Chapter6 extends Chapter {
    private String name = ChapterEnum.CHAPTER6.getChapterName();


    @Override
    protected LinkedHashMap<Integer, Exercise> listOfExerciseInit () {
        exerciseList.put(4, new Exercise4());
        exerciseList.put(8, new Exercise8());
        return exerciseList;

    }


}
