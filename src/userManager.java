import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class userManager {
    private List<User> users = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public userManager() {
        // Seed a default user (for demo)
        users.add(new User());
    }

    public void register() {
        System.out.print("Enter your username: ");
        String userName = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        users.add(new User(userName, password));
        System.out.println("Registration successful.");
    }

    public boolean login() {
        System.out.print("Enter your username: ");
        String userName = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                System.out.println("Login successful. Welcome, " + userName + "!");
                return true;
            }
        }
        System.out.println("Login failed. Username or password incorrect.");
        return false;
    }
}
