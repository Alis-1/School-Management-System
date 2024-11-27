import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private Teacher teacher;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public String toString() {
        return "Course{name='" + courseName + "', teacher=" + teacher.getName() + ", students=" + students.size() + "}";
    }
}
