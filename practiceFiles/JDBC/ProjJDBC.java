import java.sql.*;
import java.util.Scanner;
public class ProjJDBC {
    void insert(){
        try{
            String url="jdbc:mysql://localhost:3306/example";
            Scanner scanner=new Scanner(System.in);
            String user="root";
            String password="vadi";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection(url,user,password);
            System.out.println("Enter the id: ");
            int id=scanner.nextInt();
            scanner.nextLine();
            System.out.println(("Enter the name:"));
            String name=scanner.nextLine();
            System.out.println("Enter the position:");
            String position=scanner.nextLine();

            PreparedStatement pstmt=conn.prepareStatement("INSERT INTO test(id,Name,Position) VALUES(?,?, ?)");
            pstmt.setInt(1,id);
            pstmt.setString(2,name);
            pstmt.setString(3,position);
            int rowsAffected=pstmt.executeUpdate();
            if (rowsAffected>0){
                System.out.println("Data inserted sucessfully");
            }
            else{
                System.out.println("Insertion failed");
            }
            pstmt.close();
            conn.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
    void retrieve(){
        String url="jdbc:mysql://localhost:3306/example";
        String user="root";
        String password="vadi";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Scanner scanner=new Scanner(System.in);
            Connection conn= DriverManager.getConnection(url,user,password);
            System.out.println(("Enter the name you want to retrive :"));
            String name=scanner.nextLine();
            PreparedStatement pstm=conn.prepareStatement("SELECT * FROM test WHERE Name =?");
            pstm.setString(1,name);
            ResultSet res = pstm.executeQuery();
            boolean recordFound = false;
            while (res.next()) {
                recordFound = true;
                int id = res.getInt("id");
                String retrievedName = res.getString("Name");
                String position = res.getString("Position");
                System.out.println("ID: " + id + " Name: " + retrievedName + " Position: " + position);
            }
            if (!recordFound) {
                System.out.println("No records found for the given name.");
            }
            res.close();
            pstm.close();
            conn.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void update(){
        String url="jdbc:mysql://localhost:3306/example";
        String user="root";
        String password="vadi";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Scanner scanner=new Scanner(System.in);
            Connection conn=DriverManager.getConnection(url,user,password);
            System.out.println(("Enter the name you want to update:"));
            String name=scanner.nextLine();
            System.out.println("Enter the position to be updated:");
            String position=scanner.nextLine();

            PreparedStatement pstm=conn.prepareStatement("UPDATE test SET Position=? Where Name=?");
            pstm.setString(1,position);
            pstm.setString(2,name);
            int RowsAffected= pstm.executeUpdate();
            if (RowsAffected>0){
                System.out.println("Data is updated sucessfully!");
            }
            else{
                System.out.println("Updation failed");
            }
            conn.close();
            pstm.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void delete(){
        String url="jdbc:mysql://localhost:3306/example";
        String user="root";
        String password="vadi";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,user,password);
            Scanner scanner=new Scanner(System.in);
            System.out.println(("Enter the name you want to delete:"));
            String name=scanner.nextLine();
            PreparedStatement psmt=conn.prepareStatement("DELETE FROM test WHERE Name = ?");
            psmt.setString(1,name);
            int rowsAffected = psmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data deleted successfully!");
            } else {
                System.out.println("Delete failed.");
            }

            psmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void display(){
        String url="jdbc:mysql://localhost:3306/example";
        String user="root";
        String password="vadi";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection(url,user,password);
            PreparedStatement psmt= conn.prepareStatement("SELECT * FROM test");
            ResultSet res=psmt.executeQuery();
            while(res.next()){
                int id= res.getInt("id");
                String name=res.getString("Name");
                String position= res.getString("Position");
                System.out.println("ID: "+id+" Name: "+name+" Position: "+position);
            }
            conn.close();
            psmt.close();
            res.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        ProjJDBC obj=new ProjJDBC();
        try{
            while (true) {
                System.out.println("Enter the choice you want: 1) Insert 2) Retrive 3)Update 4) Delete 5) Display 6)Exit");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    obj.insert();
                }
                else if (choice==2){
                    obj.retrieve();
                }
                else if (choice==3){
                    obj.update();
                }
                else if (choice==4){
                    obj.delete();
                }
                else if (choice==5){
                    obj.display();
                }
                else if (choice==6){
                    System.out.println("We are done with the querying.....Exiting now!!!");
                    break;
                }
                else{
                    System.out.println("An invalid option!!!");
                }

            }

        } catch (Exception e) {
            System.out.println("There seems to be an error"+ e.getMessage());
            e.printStackTrace();
        }
        scanner.close();
    }


}
