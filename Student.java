import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private int gradeLevel;
    private int age;
    private List<Integer> grades; // List of grades

    public Student(String name, String id, int gradeLevel, int age) {
        super(name, id);
        this.gradeLevel = gradeLevel;
        this.age = age;
        this.grades = new ArrayList<>();
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public int getAge() {
        return age;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    @Override
    public String toString() {
        return "Student{name='" + getName() + "', id='" + getId() + "', gradeLevel=" + gradeLevel + ", age=" + age + ", grades=" + grades + "}";
    }
}