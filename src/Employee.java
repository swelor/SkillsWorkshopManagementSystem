public class Employee {
    private String username;
    private String password;

    // default constructor for seeding
    public Employee() {
        this.username = "admin";
        this.password = "admin123";
    }

    public Employee(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
}
