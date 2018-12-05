package by.javatr.supertask.student.creator;

import by.javatr.supertask.exception.NotValidArgumentsOfMethodException;
import by.javatr.supertask.student.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentsListCreator {

    public  List<Student> createListOfStudents(List<String> names, List<Double> gradePointAverageList) throws NotValidArgumentsOfMethodException {
        List<Student> students = new ArrayList<>();
        if(names.size() != gradePointAverageList.size()){
          throw new NotValidArgumentsOfMethodException("names size should be equals gradePointAverageList size");
        }
        StudentCreator creator = new StudentCreator();
        for(int i = 0; i< names.size() ; ++i){
            Student student = creator.create(names.get(i),gradePointAverageList.get(i));
            if(student != null){
                students.add(student);
            }
        }
        return students;
    }
}
