import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user);
    }

    public void removeUser(String email) {
        users.removeIf(user -> user.getEmail().equals(email));
        System.out.println("User removed with email: " + email);
    }

    public void updateUser(String email, String newName, String newRole) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                user.update(newName, newRole);
                System.out.println("User updated: " + user);
                return;
            }
        }
    }
}
