import java.sql.*;
public class ExampleDelete {
    public static void main(String[]args){
        String url="jdbc:mysql://localhost:3306/example";
        String user="root";
        String password="vadi";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,user,password);
            Statement stmt= conn.createStatement();

            String query = "DELETE FROM test WHERE Name = 'ANNA'";
            int rowsAffected = stmt.executeUpdate(query);

            if (rowsAffected > 0) {
                System.out.println("Data deleted successfully!");
            } else {
                System.out.println("Delete failed.");
            }

            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
