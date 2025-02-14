import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Dele {
    public static void main(String[] args){
        try {
            File myfile = new File("data.txt");
            Scanner scanner = new Scanner(myfile);
            StringBuilder content=new StringBuilder();


            while (scanner.hasNextLine()){

                content.append(scanner.nextLine()).append("");
            }
            scanner.close();
            ArrayList<String> newcont=new ArrayList<>(Arrays.asList(content.toString().split("\\.\\s*")));
            System.out.println(newcont);
            Scanner inn=new Scanner(System.in);
            System.out.println("enter the line you want to delete: ");
            int num=inn.nextInt();
            newcont.remove((num-1));
            inn.close();
            FileWriter writer=new FileWriter("example.txt");
            for (String a:newcont){
                writer.write(a+'.');
            }
            writer.close();
            System.out.println(newcont);



        } catch (FileNotFoundException e) {
            System.out.println("File is missing");
        }
        catch (IOException a){
            System.out.println("There is an error.");
        }

    }
}
