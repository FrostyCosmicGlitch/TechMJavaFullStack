import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.*;
public class ExampleRetrive {
    public static void main(String[]args){
        String url="jdbc:mysql://localhost:3306/example";
        String user="root";
        String password="vadi";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection(url,user,password);
            Statement stmt= conn.createStatement();
            ResultSet res=stmt.executeQuery("SELECT * FROM test");
            while(res.next()){
                int id= res.getInt("id");
                String name=res.getString("Name");
                String position= res.getString("Position");
                System.out.println("ID: "+id+" Name: "+name+" Position: "+position);
            }
            conn.close();
            stmt.close();
            res.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
