package by.javatr.supertask.student.validator;

public class GradePointAverageValidator {
    public static boolean isValid(double gradePointAverage ){
        return  gradePointAverage <= 10 && gradePointAverage >=0;
    }
}
