public class Main {

    public static void main(String[] args) {

        School school = new School();



        // Create students

        Student student1 = new Student("Alice", "S001", 10);

        Student student2 = new Student("Bob", "S002", 12);

        school.addStudent(student1);

        school.addStudent(student2);



        // Create teachers

        Teacher teacher1 = new Teacher("Mr. Smith", "T001", "Math");

        Teacher teacher2 = new Teacher("Ms. Johnson", "T002", "Science");

        school.addTeacher(teacher1);

        school.addTeacher(teacher2);



        // Create courses

        Course mathCourse = new Course("Math 101");

        mathCourse.assignTeacher(teacher1);

        mathCourse.addStudent(student1);

        school.addCourse(mathCourse);



        Course scienceCourse = new Course("Science 101");

        scienceCourse.assignTeacher(teacher2);

        scienceCourse.addStudent(student2);

        school.addCourse(scienceCourse);



        // List all courses

        school.listCourses();

    }

}