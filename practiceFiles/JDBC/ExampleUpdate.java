import java.sql.*;
public class ExampleUpdate {
    public static void main(String[]args){
        String url="jdbc:mysql://localhost:3306/example";
        String user="root";
        String password="vadi";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,user,password);
            Statement stmt= conn.createStatement();

            String query="UPDATE test SET Position='Director' Where Name='Anna'";
            int RowsAffected= stmt.executeUpdate(query);
            if (RowsAffected>0){
                System.out.println("Data is updated sucessfully!");
            }
            else{
                System.out.println("Updation failed");
            }
            conn.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
