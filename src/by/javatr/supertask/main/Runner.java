package by.javatr.supertask.main;

import by.javatr.supertask.exception.NotValidArgumentsOfMethodException;
import by.javatr.supertask.group.Group;
import by.javatr.supertask.group.filter.GroupFilter;
import by.javatr.supertask.reader.SystemInReader;
import by.javatr.supertask.student.Student;
import by.javatr.supertask.student.creator.StudentsListCreator;

import java.util.ArrayList;
import java.util.List;

public class Runner {


    public static void InitLists(List<String> names, List<Double> gradePointAverageList,SystemInReader reader,int size){
        for (int i = 0; i < size ;++i){
            System.out.println("Student: " + i);
            System.out.println("Enter name: ");
            names.add(reader.readLine());
            System.out.println("Enter grade point average: ");
            gradePointAverageList.add(reader.readDouble());
        }
    }
    public static void main(String ... args){
        SystemInReader reader = new SystemInReader();
        System.out.println("Enter size of Group");
        int size = reader.readCountingInteger();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double>  gradePointAverageList = new ArrayList<>();
        InitLists(names, gradePointAverageList, reader, size);

        StudentsListCreator creator = new StudentsListCreator();
        List<Student> students = null;
        try {
            students = creator.createListOfStudents(names,gradePointAverageList);
        } catch (NotValidArgumentsOfMethodException e) {
            e.printStackTrace();
        }

        Group group = new Group(students);

        System.out.println("Group grade point average = " + group.calculateGradePointAverage());
        System.out.println(
                "Count of students smaller than 4.0 = " +
                GroupFilter.getStudentsWhichMarksSmallerThanParametr(4.0, group));
        System.out.println(
                "Count of students bigger or equals than 8.0 = " +
                        GroupFilter.getStudentsWhichMarksBiggerThanParametr(8.0, group));
        System.out.println("Marks of every student");
        System.out.println(group.marksOfEveryStudent());




    }
}
