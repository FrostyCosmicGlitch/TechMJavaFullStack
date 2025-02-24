import java.sql.*;
import java.util.Scanner;

public class UpdateRow {
    private static final String URL = "jdbc:mysql://localhost:3306/details";
    private static final String USER = "root";
    private static final String PASSWORD = "pass";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Scanner sc = new Scanner(System.in);
             PreparedStatement pstmt = conn.prepareStatement("UPDATE users SET age = ? WHERE id = ?")) {

            System.out.print("Enter user ID to update: ");
            int id = sc.nextInt();
            System.out.print("Enter new age: ");
            int newAge = sc.nextInt();

            pstmt.setInt(1, newAge);
            pstmt.setInt(2, id);

            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected > 0 ? "Row updated successfully." : "No row found with the given ID.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
