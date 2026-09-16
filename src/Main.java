import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- Workshop Manager ---");
        System.out.println("Developed and maintained by: LJ 'swelor' Matsoane");
        System.out.println("Date: " + java.time.LocalDate.now());

        // login logic
        UserManager userManager = new UserManager();
        boolean loggedIn = userManager.login();

        if (!loggedIn) {
            System.out.println("Exiting application...");
            return;
        }

        // welcome message for after the login per user
        UserManager currentUser = userManager.getLoggedInUser();
        String username = currentUser != null ? currentUser.getUsername() : "guest";

        String[] welcomeMessages = {
            "Life is a sandwich, no matter how it flips the bread comes first. Let's get this bread, " + username + "!",
            "Real Gs move in silence like lasagna. You're a G, " + username + "!",
            "It may not be today, tomorrow, next week, or next month. One day, you will be a champion.",
            "Well well well, back to bring more heat, " + username + "?"
        };
        int randomIndex = (int) (Math.random() * welcomeMessages.length);
        System.out.println(welcomeMessages[randomIndex]);

        // main menu
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMain menu:");
            System.out.println("1. Manage Workshops");
            System.out.println("2. Manage Participants");
            System.out.println("3. Register Participants");
            System.out.println("4. Search Records");
            System.out.println("5. Display Registration Summary");
            System.out.println("6. Export Report (Excel/JSON)");
            System.out.println("7. Load Saved Data");
            System.out.println("8. Database Operations");
            System.out.println("9. Exit");

            System.out.print("Select an option: ");
            int choice = scanner.nextLine();
            scanner.nextLine(); // consume leftover newline

            switch (choice) {
                case 9:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Option " + choice + " not implemented yet.");
            }
        }

        scanner.close();
    }
}
