import java.sql.DriverManager;
import java.sql.*;

public class ExampleInsert {
    public static void main(String [] args){
        String url="jdbc:mysql://localhost:3306/example";
        String user="root";
        String password="vadi";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection(url,user,password);
            Statement stmt= conn.createStatement();

            String query="INSERT INTO test(id,Name,Position) VALUES(1,'Anna','Staff')";
            int rowsAffected=stmt.executeUpdate(query);

            if (rowsAffected>0){
                System.out.println("Data inserted sucessfully");
            }
            else{
                System.out.println("Insertion failed");
            }
            stmt.close();
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
