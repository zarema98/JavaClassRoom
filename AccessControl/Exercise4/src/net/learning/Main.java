package net.learning;

import com.company.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
      //!  student.getInfo(); // нет доступа к защищенным методам,
                              // объявленным в пределах другого пакета
    }
}
