// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demirog");
        instructor.setNationalIdentity("123123123");
        instructor.setBootcampName("Java");

        Student student1 = new Student();
        student1.setId(2);
        student1.setNationalIdentity("33333333");
        student1.setFirstName("Mert");
        student1.setLastName("Duran");
        student1.setDepartment("iOS");

        Student student2 = new Student();
        student2.setId(3);
        student2.setNationalIdentity("444444444");
        student2.setFirstName("Mert");
        student2.setLastName("Duran");
        student2.setDepartment("iOS");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addedInstructor(instructor);

        StudentManager studentManager = new StudentManager();
        studentManager.addDepartment(student1);
        studentManager.addDepartment(student2);

        UserManager userManager = new UserManager();
        userManager.add(instructor);
        userManager.add(student1);
        userManager.add(student2);

    }
}