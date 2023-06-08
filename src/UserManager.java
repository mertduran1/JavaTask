public class UserManager {
    public void add(User user) {
        System.out.println("Added user " + user.getFirstName() + " " + user.getLastName() + " " + user.getNationalIdentity());
    }
}
