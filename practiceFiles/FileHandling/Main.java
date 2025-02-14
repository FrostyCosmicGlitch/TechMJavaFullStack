// creating a file

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
public class Main {
    public static void main(String[] args) {
        try{
            File myfile=new File("example.txt");
            if (myfile.createNewFile()){
                System.out.println("File is created: "+myfile.getName());
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println("An error has occured");
        }
    }
}




// write in a file

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer=new FileWriter("example.txt");
            writer.write("Hello people,this is my first file in java");
            writer.close();
            System.out.println("We have sucessfully written the file");

        }
        catch(IOException e){
            System.out.println("An error has occured");
        }
    }
}



// Read a file

public class Main {
    public static void main(String[] args) {
        try {
            File myfile=new File("example.txt");
            Scanner scanner= new Scanner(myfile);
            while (scanner.hasNextLine()){
                String data= scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File is missing");
        }
    }
}

 */

// deleting a file

public class Main {
    public static void main(String[] args) {
        File myfile=new File("example.txt");
        if (myfile.delete()){
            System.out.println("The file got deleted :"+myfile.getName());
        }
        else{
            System.out.println("The file did not get deleted");
        }
    }


}