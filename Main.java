import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        School school = new School();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Tulostetaan valikko
            System.out.println("\n--- Koulun Hallintajärjestelmä ---");
            System.out.println("1. Lisää oppilas");
            System.out.println("2. Poista oppilas");
            System.out.println("3. Lisää opettaja");
            System.out.println("4. Poista opettaja");
            System.out.println("5. Lisää kurssi");
            System.out.println("6. Poista kurssi");
            System.out.println("7. Lisää opettaja kurssille");
            System.out.println("8. Rekisteröi oppilas kurssille");
            System.out.println("9. Listaa kaikki kurssit, oppilaat ja opettajat");
            System.out.println("10. Hae oppilaan arvosanat");
            System.out.println("0. Lopeta");
            System.out.print("Valitse toiminto: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Puhdistetaan rivinvaihto seuraavaa syötettä varten

            switch (choice) {
                case 1:
                    // Lisää oppilas
                    System.out.print("Anna oppilaan nimi: ");
                    String name = scanner.nextLine();
                    System.out.print("Anna oppilaan ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Anna oppilaan luokka-aste: ");
                    int gradeLevel = scanner.nextInt();
                    System.out.print("Anna oppilaan ikä: ");
                    int age = scanner.nextInt();
                    school.addStudent(new Student(name, id, gradeLevel, age));
                    System.out.println("Oppilas lisätty.");
                    break;

                case 2:
                    // Poista oppilas
                    System.out.print("Anna poistettavan oppilaan ID: ");
                    String removeId = scanner.nextLine();
                    school.removeStudent(removeId);
                    System.out.println("Oppilas poistettu.");
                    break;

                case 3:
                    // Lisää opettaja
                    System.out.print("Anna opettajan nimi: ");
                    String teacherName = scanner.nextLine();
                    System.out.print("Anna opettajan ID: ");
                    String teacherId = scanner.nextLine();
                    System.out.print("Anna opettajan aine: ");
                    String subject = scanner.nextLine();
                    school.addTeacher(new Teacher(teacherName, teacherId, subject));
                    System.out.println("Opettaja lisätty.");
                    break;

                case 4:
                    // Poista opettaja
                    System.out.print("Anna poistettavan opettajan ID: ");
                    String removeTeacherId = scanner.nextLine();
                    school.removeTeacher(removeTeacherId);
                    System.out.println("Opettaja poistettu.");
                    break;

                case 5:
                    // Lisää kurssi
                    System.out.print("Anna kurssin nimi: ");
                    String courseName = scanner.nextLine();
                    school.addCourse(new Course(courseName));
                    System.out.println("Kurssi lisätty.");
                    break;

                case 6:
                    // Poista kurssi
                    System.out.print("Anna poistettavan kurssin nimi: ");
                    String courseToRemove = scanner.nextLine();
                    school.removeCourse(courseToRemove);
                    System.out.println("Kurssi poistettu.");
                    break;

                case 7:
                    // Lisää opettaja kurssille
                    System.out.print("Anna kurssin nimi: ");
                    String courseNameToAssignTeacher = scanner.nextLine();
                    System.out.print("Anna opettajan ID: ");
                    String teacherIdToAssign = scanner.nextLine();
                    Course courseToAssign = school.getCourseByName(courseNameToAssignTeacher);
                    Teacher teacherToAssign = school.getTeacherById(teacherIdToAssign);
                    if (courseToAssign != null && teacherToAssign != null) {
                        courseToAssign.assignTeacher(teacherToAssign);
                        System.out.println("Opettaja lisätty kurssille.");
                    } else {
                        System.out.println("Virhe: Kurssia tai opettajaa ei löydy.");
                    }
                    break;

                case 8:
                    // Rekisteröi oppilas kurssille
                    System.out.print("Anna kurssin nimi: ");
                    String courseNameToEnroll = scanner.nextLine();
                    System.out.print("Anna oppilaan ID: ");
                    String studentIdToEnroll = scanner.nextLine();
                    Course courseToEnroll = school.getCourseByName(courseNameToEnroll);
                    Student studentToEnroll = school.getStudentById(studentIdToEnroll);
                    if (courseToEnroll != null && studentToEnroll != null) {
                        courseToEnroll.addStudent(studentToEnroll);
                        System.out.println("Oppilas rekisteröity kurssille.");
                    } else {
                        System.out.println("Virhe: Kurssia tai oppilasta ei löydy.");
                    }
                    break;

                case 9:
                    // Listaa kaikki kurssit, oppilaat ja opettajat
                    school.listCourses();
                    school.listStudents();
                    school.listTeachers();
                    break;

                case 10:
                    // Hae oppilaan arvosanat
                    System.out.print("Anna oppilaan ID: ");
                    String studentIdForGrades = scanner.nextLine();
                    Student studentForGrades = school.getStudentById(studentIdForGrades);
                    if (studentForGrades != null) {
                        System.out.println("Oppilaan arvosanat: " + studentForGrades.getGrades());
                    } else {
                        System.out.println("Virhe: Oppilasta ei löydy.");
                    }
                    break;

                case 0:
                    // Lopeta ohjelma
                    running = false;
                    System.out.println("Ohjelma lopetetaan.");
                    break;

                default:
                    System.out.println("Virheellinen valinta. Yritä uudelleen.");
                    break;
            }
        }

        scanner.close();
    }
}