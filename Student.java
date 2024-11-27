public class Student extends Person {

    private int gradeLevel;
    private int age;



    public Student(String name, String id, int gradeLevel, int age) {

        super(name, id);

        this.gradeLevel = gradeLevel;
        this.age = age;

    }



    public int getGradeLevel() {

        return gradeLevel;

    }

    public int getAge() {
        return age;
    }



    @Override

    public String toString() {

        return "Student{name='" + getName() + "', id='" + getId() + "', gradeLevel=" + gradeLevel + ", age=" + age + "}";

    }

}
