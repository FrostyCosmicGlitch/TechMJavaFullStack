import java.sql.*;
import java.util.Scanner;

public class MenuDrivenJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/details";
    private static final String USER = "root";
    private static final String PASSWORD = "pass";

    public static void insertRow(Scanner sc, Connection conn) throws SQLException {
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        String query = "INSERT INTO users (name, age) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.executeUpdate();
            System.out.println("Row inserted successfully.");
        }
    }

    public static void updateRow(Scanner sc, Connection conn) throws SQLException {
        System.out.print("Enter user ID to update: ");
        int id = sc.nextInt();
        System.out.print("Enter new age: ");
        int newAge = sc.nextInt();

        String query = "UPDATE users SET age = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, newAge);
            pstmt.setInt(2, id);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected > 0 ? "Row updated successfully." : "No row found with the given ID.");
        }
    }

    public static void deleteRow(Scanner sc, Connection conn) throws SQLException {
        System.out.print("Enter user ID to delete: ");
        int id = sc.nextInt();

        String query = "DELETE FROM users WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected > 0 ? "Row deleted successfully." : "No row found with the given ID.");
        }
    }

    public static void selectRow(Scanner sc, Connection conn) throws SQLException {
        System.out.print("Enter user ID to fetch: ");
        int id = sc.nextInt();

        String query = "SELECT * FROM users WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
            } else {
                System.out.println("No record found.");
            }
        }
    }

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Scanner sc = new Scanner(System.in)) {

            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Insert a new Row");
                System.out.println("2. Update a Row");
                System.out.println("3. Delete a Row");
                System.out.println("4. Select a Row");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        insertRow(sc, conn);
                        break;
                    case 2:
                        updateRow(sc, conn);
                        break;
                    case 3:
                        deleteRow(sc, conn);
                        break;
                    case 4:
                        selectRow(sc, conn);
                        break;
                    case 5:
                        System.out.println("Exiting program...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
