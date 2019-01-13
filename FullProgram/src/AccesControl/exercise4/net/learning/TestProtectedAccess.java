package AccesControl.exercise4.net.learning;
import AccesControl.exercise4.com.company.Student;

public class TestProtectedAccess {
        Student student = new Student();

        public void info () {
            //!  student.getInfo(); // нет доступа к защищенным методам,
            // объявленным в пределах другого пакета
        }
}
