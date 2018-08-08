package whildhogs;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Student galina = new Student("Galina", 95, "Philology", Student.Gender.FEMALE);
        Student anton = new Student("Anton", 90, "CS", Student.Gender.MALE);
        Student jack = new Student("Jack", 82, "Philology", Student.Gender.MALE);
        Student mike = new Student("Mike", 60, "Philology", Student.Gender.MALE);
        Student jane = new Student("Jane", 65, "CS", Student.Gender.FEMALE);

        Student[] students = new Student[]{galina, anton, jack, mike, jane};

        getTheNumberOfStudentsByGenderForEachDepartment(Arrays.stream(students));
//        getStudentNamesByDepartment(Arrays.stream(students));
//        getNumberOfStudentsByDepartment(Arrays.stream(students));
//        getStudentNamesByDepartment(Arrays.stream(students));
//                getAverageGradeByDepartment(Arrays.stream(students));
//        getStudentNamesByDepartment(Arrays.stream(students));


    }

    public static Map<String, Map<Student.Gender, Long>> getTheNumberOfStudentsByGenderForEachDepartment(Stream<Student> students) {

        Map<String, Map<Student.Gender, Long>> map = students.collect(
                Collectors.groupingBy(Student::getDepartment,
                Collectors.groupingBy(Student::getGender,
                        Collectors.counting())));


        return null;

    }



    public static Map<String, List<String>> getStudentNamesByDepartment(Stream<Student> students) {

        Map<String, List<String>> getStudent = students
                .collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.mapping(Student::getName, Collectors.toList())));
        return getStudent;
    }


    public static Map<String, Long> getNumberOfStudentsByDepartment(Stream<Student> students) {

        Map<String, Long> number = students.collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()));
        return number;

    }

    public static Map<String, Double> getAverageGradeByDepartment(Stream<Student> students) {
        Map<String, Double> avgGradeByDepartment;
        Stream<Student> stream1 = students;
        Stream<Student> stream2 = null;
        stream2 = students;

        avgGradeByDepartment = students.collect(Collectors.groupingBy(Student::getDepartment, Collectors.averagingDouble(Student::getGrade)));
        System.out.println(avgGradeByDepartment);
        return null;
    }
}

class Student {
    private String name;
    private double grade;
    private String department;
    private Gender gender;

    public static final double PASSING_GRADE = 70.0;

    public enum Gender {
        MALE, FEMALE
    }

    public Student(String name, double grade, String department, Gender gender) {
        this.name = name;
        this.grade = grade;
        this.department = department;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}