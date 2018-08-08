package whildhogs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(23, 88, "David Goodman"));
        students.add(new Student(25, 82, "Mark Rose"));
        students.add(new Student(22, 90, "Jane Doe"));
        students.add(new Student(25, 90, "Jane Dane"));

        sort(students);
    }
    public static String sort(List<Student> students) {
        String score = students.stream()
                .sorted((s1, s2) -> s1.getAge() - s2.getAge())
                .sorted((s1, s2) -> s1.getFullName().split(" ")[1].charAt(0)-(s2.getFullName().split(" ")[1].charAt(0)))
                .sorted((s1, s2) -> s2.getGpa() - s1.getGpa())
                .map(s -> s.getFullName())
                .reduce("", (s1, s2) -> s1 + s2 + ",");
        score = score.substring(0, score.lastIndexOf(','));

        String cos = score.toString();
        System.out.println(score);
        return score;
    }
}


class Student {
    private int gpa;
    private int age;
    private String fullName;

    public Student(int age, int gpa, String fullName) {
        this.age = age;
        this.gpa = gpa;
        this.fullName = fullName;
    }
    public int getGpa() {
        return gpa;
    }
    public int getAge() {
        return age;
    }
    public String getFullName() {
        return fullName;
    }
}