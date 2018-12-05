package by.javatr.supertask.group;

import by.javatr.supertask.student.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Group {

    List<Student> students = new ArrayList<>();
    public  Group(List<Student> students){
        this.students = students;
    }

    public List<? extends Student> getStudents(){
        return Collections.unmodifiableList(students);
    }

    public double calculateGradePointAverage(){
        double sum = 0;
        for (Student student:students){
            sum+=student.getGradePointAverage();
        }
        return sum/students.size();
    }

    public List<Double> marksOfEveryStudent(){
        List<Double> marks = new LinkedList<>();
        for (Student student:students){
            marks.add(student.getGradePointAverage());
        }
        return marks;
    }


}
