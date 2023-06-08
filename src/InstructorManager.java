public class InstructorManager extends UserManager {
    public void addedInstructor(Instructor instructor) {
        System.out.println("Bootcamp : " +instructor.getBootcampName());
    }
}
