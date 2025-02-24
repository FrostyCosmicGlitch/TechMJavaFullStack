import java.sql.*;
import java.util.Scanner;

public class DeleteRow {
    private static final String URL = "jdbc:mysql://localhost:3306/details";
    private static final String USER = "root";
    private static final String PASSWORD = "pass";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Scanner sc = new Scanner(System.in);
             PreparedStatement pstmt = conn.prepareStatement("DELETE FROM users WHERE id = ?")) {

            System.out.print("Enter user ID to delete: ");
            int id = sc.nextInt();

            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();

            System.out.println(rowsAffected > 0 ? "Row deleted successfully." : "No row found with the given ID.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
