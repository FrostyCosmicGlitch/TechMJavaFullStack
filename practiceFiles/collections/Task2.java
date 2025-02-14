import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    public static void main(String[]args){
        HashMap<String, Integer> details=new HashMap<>();
        details.put("Anu", 90);
        details.put("Baanu",80);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lets fill the student details: ");
        while (true){
            System.out.println("There are 5 options for you to choose: add student marks(1) or update marks(2) or remove a student(3) or display all students and their marks(4) or exit (5)::   ");
            int choice=scanner.nextInt();
            scanner.nextLine();
            if (choice==1){
                System.out.println("Enter the student name: ");
                String name=scanner.nextLine();
                System.out.println("Enter the student marks: ");
                int marks=scanner.nextInt();
                details.put(name,marks);
            } else if (choice==2) {
                System.out.println("Enter the student name: ");
                String name=scanner.nextLine();
                System.out.println("Enter the student updated marks: ");
                int marks=scanner.nextInt();
                details.put(name,marks);

            } else if (choice==3) {
                System.out.println("Enter the student to be removed: ");
                String name=scanner.nextLine();
                details.remove(name);

            } else if (choice==4) {
                System.out.println("The student details are: ");
                for (String name : details.keySet()) {
                    System.out.println(name + " : " + details.get(name));
                }

            } else if (choice==5) {
                System.out.println("I see that we are done with editing .");
                break;

            }
            else{
                System.out.println("It is an invaild option");
            }

        }

    }
}
