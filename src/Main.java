public class Main {
    public static void main(String[] args) {

        UserManager manager = new UserManager();

        User user1 = new User("Aruzhan", "aru@gmail.com", "Admin");
        User user2 = new User("Dias", "dias@gmail.com", "User");

        manager.addUser(user1);
        manager.addUser(user2);

        manager.updateUser("dias@gmail.com", "Dias K.", "Admin");

        manager.removeUser("aru@gmail.com");
    }
}
