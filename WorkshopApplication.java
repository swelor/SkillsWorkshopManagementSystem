import java.util.Scanner;

class WorkshopApplication {
    public static void main(String[] args) {
        // Opener message
        System.out.println("\n=== Workshop Management System v1.0 ===");
        System.out.println("Developed by: John Doe");
        System.out.println("Date: " + java.time.LocalDate.now());
        System.out.println("Welcome to the Workshop Management System!\n");

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Main Menu:");
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
            int choice = scanner.nextInt();

            switch (choice) {
                case 9: running = false; break;
                default: System.out.println("Option " + choice + " not implemented yet.");
            }
        }

        scanner.close();
    }
}
