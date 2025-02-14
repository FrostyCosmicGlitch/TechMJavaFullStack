

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class Replace {
    public static void main(String[]args){
        try {
            File myfile = new File("data.txt");
            Scanner scanner = new Scanner(myfile);
            Scanner ip=new Scanner(System.in);

            System.out.println("Enter the word to be replaced:");
            String rep= ip.nextLine();

            System.out.println("Enter the word:");
            String word= ip.nextLine();

            StringBuilder oldContent=new StringBuilder();
            while (scanner.hasNextLine()){

                oldContent.append(scanner.nextLine()).append("\n");
            }
            System.out.println("before content/n"+oldContent);
            String content =oldContent.toString().replace(rep,word);
            FileWriter writer=new FileWriter("data.txt");
            writer.write(content);
            writer.close();
            System.out.println("We have sucessfully written the file \n"+content);
            ip.close();
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        }
        catch (IOException a){
            System.out.println("There is an error in the input");
        }
    }
}
