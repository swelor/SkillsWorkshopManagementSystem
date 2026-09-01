public class MarksStatistics {
    static final int PASS_MARK = 50;
    public static void main(String[] args) {
        int[] marks = {72, 45, 88, 63, 91, 38, 55, 79};
        
        // Print all marks
        System.out.println("All marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("Student %d: %d\n", i+1, marks[i]);
        }
        
        // Calculate statistics
        int total = 0;
        int passed = 0;
        int failed = 0;
        int high = marks[0];
        int low = marks[0];
        
        for (int mark : marks) {
            total += mark;
            if (mark >= PASS_MARK) passed++;
            else failed++;
            if (mark > high) high = mark;
            if (mark < low) low = mark;
        }
        
        // Format output
        System.out.println("\n--- CLASS STATISTICS ---");
        System.out.printf("Number of marks : %d\n", marks.length);
        System.out.printf("Total    : %d\n", total);
        System.out.printf("Average    : %.2f\n", (double) total / marks.length);
        System.out.printf("Highest    : %d\n", high);
        System.out.printf("Lowest    : %d\n", low);
        System.out.printf("Range    : %d\n", high - low);
        System.out.printf("Passed (>=50) : %d\n", passed);
        System.out.printf("Failed (<50)  : %d\n", failed);
        System.out.printf("Pass rate    : %.1f%%%n", (double) passed * 100 / marks.length);
    }
}