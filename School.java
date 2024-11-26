public class School {

    private List<Student> students;

    private List<Teacher> teachers;

    private List<Course> courses;



    public School() {

        students = new ArrayList<>();

        teachers = new ArrayList<>();

        courses = new ArrayList<>();

    }



    public void addStudent(Student student) {

        students.add(student);

    }



    public void addTeacher(Teacher teacher) {

        teachers.add(teacher);

    }



    public void addCourse(Course course) {

        courses.add(course);

    }



    public void listCourses() {

        for (Course course : courses) {

            System.out.println(course);

        }

    }

}
