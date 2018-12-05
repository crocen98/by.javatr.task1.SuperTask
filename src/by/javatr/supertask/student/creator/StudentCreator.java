package by.javatr.supertask.student.creator;

import by.javatr.supertask.student.Student;
import by.javatr.supertask.student.validator.GradePointAverageValidator;

public class StudentCreator {

    public  Student create(String name, double gradePointAverage){
        if(GradePointAverageValidator.isValid(gradePointAverage)){
            return new Student(name,gradePointAverage);
        }
        return null;
    }


}
