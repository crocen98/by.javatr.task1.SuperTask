package by.javatr.supertask.group.filter;

import by.javatr.supertask.group.Group;
import by.javatr.supertask.student.Student;

import java.util.LinkedList;
import java.util.List;

public class GroupFilter {

    public static  int getStudentsWhichMarksInRange(double left, double right, Group group){
        List<Student> students = new LinkedList<>();
        for (Student student: group.getStudents()){
            if(student.getGradePointAverage() >= left
            && student.getGradePointAverage() < right){
                students.add(student);
            }
        }
        return students.size();
    }


    public static int getStudentsWhichMarksSmallerThanParametr(double parametr,Group group){
        int count = getStudentsWhichMarksInRange(0,parametr,group);
        return count;
    }

    public static int getStudentsWhichMarksBiggerThanParametr(double parametr,Group group){
        int count = getStudentsWhichMarksInRange(parametr,10.0 ,group);
        return count;
    }

}
