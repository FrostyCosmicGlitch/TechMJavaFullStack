import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filee {
    public static void main(String[]args){
        try{
            File myfile=new File("data.txt");
            if (myfile.createNewFile()){
                System.out.println("File got created :"+myfile.getName());
            }
            else{
                System.out.println("File already exists");
            }
            FileWriter writer=new FileWriter("data.txt");
            writer.write("hey nice to meet you. its fun here. I am really excited to meet you. Lets eat together!!!");
            writer.close();
            System.out.println("File got written");

            Scanner scanner=new Scanner(myfile);
            while(scanner.hasNextLine()){
                String data= scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();

        }
        catch (FileNotFoundException e){
            System.out.println("file is missing");
        } catch (IOException e) {
            System.out.println("Something is wrong here");
        }


    }
}
