import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students;
    private List<Teacher> teachers;
    private List<Course> courses;

    public School() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        courses = new ArrayList<>();
    }

    // Add a student to the school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Remove a student by ID
    public void removeStudent(String id) {
        students.removeIf(student -> student.getId().equals(id));
    }

    // Add a teacher to the school
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    // Remove a teacher by ID
    public void removeTeacher(String id) {
        teachers.removeIf(teacher -> teacher.getId().equals(id));
    }

    // Add a course to the school
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Remove a course by name
    public void removeCourse(String courseName) {
        courses.removeIf(course -> course.getCourseName().equals(courseName));
    }

    // List all students
    public void listStudents() {
        System.out.println("Oppilaat:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // List all teachers
    public void listTeachers() {
        System.out.println("Opettajat:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    // List all courses
    public void listCourses() {
        System.out.println("Kurssit:");
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    // Get a course by name
    public Course getCourseByName(String courseName) {
        for (Course course : courses) {
            if (course.getCourseName().equals(courseName)) {
                return course;
            }
        }
        return null; // If not found
    }

    // Get a student by ID
    public Student getStudentById(String studentId) {
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                return student;
            }
        }
        return null; // If not found
    }

    // Get a teacher by ID
    public Teacher getTeacherById(String teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher.getId().equals(teacherId)) {
                return teacher;
            }
        }
        return null; // If not found
    }
}
