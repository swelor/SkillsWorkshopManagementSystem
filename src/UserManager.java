import java.util.Scanner;

public class UserManager {
    private String username;
    private String password;

    // default constructor for seeding
    public UserManager() {
        this.username = "admin";
        this.password = "admin123";
    }

    public UserManager(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // default constructor for seeding
    public boolean login() {
        // this takes the user input
        Scanner scanner = new Scanner(System.in);

        // login details input
        System.out.println("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.println("Enter password: ");
        String inputPassword = new String(System.console().readPassword());
        // add null check for no console

        if (inputUsername.equals(this.username) && inputPassword.equals(this.password)) {
            return true;
        } else {
            return false;
        }

    }

    public UserManager getLoggedInUser() {
        // here is where the current user logic goes
        return this;
    }
}
