public class Teacher extends Person {
    private String subject;

    public Teacher(String name, String id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Opettaja{nimi='" + getName() + "', id='" + getId() + "', aihe='" + subject + "'}";
    }
}
