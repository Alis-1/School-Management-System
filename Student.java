public class Student extends Person {

    private int gradeLevel;



    public Student(String name, String id, int gradeLevel) {

        super(name, id);

        this.gradeLevel = gradeLevel;

    }



    public int getGradeLevel() {

        return gradeLevel;

    }



    @Override

    public String toString() {

        return "Student{name='" + getName() + "', id='" + getId() + "', gradeLevel=" + gradeLevel + "}";

    }

}
