import java.sql.*;
import java.util.Scanner;

public class RecursiveInsert {
    private static final String URL = "jdbc:mysql://localhost:3306/details";
    private static final String USER = "root";
    private static final String PASSWORD = "pass";

    public static void insertRows(Connection conn, PreparedStatement pstmt, Scanner sc, int count) throws SQLException {
        if (count == 0) return;

        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        pstmt.setString(1, name);
        pstmt.setInt(2, age);
        pstmt.executeUpdate();

        insertRows(conn, pstmt, sc, count - 1);
    }

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Scanner sc = new Scanner(System.in);
             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO users (name, age) VALUES (?, ?)")) {

            System.out.print("Enter number of rows to insert: ");
            int n = sc.nextInt();
            insertRows(conn, pstmt, sc, n);

            System.out.println("Rows inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
