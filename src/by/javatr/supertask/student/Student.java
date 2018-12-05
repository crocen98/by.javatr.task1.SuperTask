package by.javatr.supertask.student;

public class Student {
    private double gradePointAverage;
    private String name;

    public Student(String name, double gradePointAverage) {
        this.name = name;
        this.gradePointAverage = gradePointAverage;
    }

    public double getGradePointAverage() {
        return gradePointAverage;
    }

    public String getName() {
        return name;
    }

    public void setGradePointAverage(double gradePointAverage) {
        this.gradePointAverage = gradePointAverage;
    }

    public void setName(String name) {
        this.name = name;
    }
}
