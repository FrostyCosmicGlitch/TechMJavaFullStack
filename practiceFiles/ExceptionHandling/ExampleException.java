
import java.util.Scanner;

class myException extends Exception{
    public myException(String message){
        super(message);
    }
}


public class ExampleException {
    public static void main(String[]args) {

        int Balance = 7000;
        Scanner scanner = new Scanner(System.in);

        try {

            while (true) {
                System.out.println("Enter your choice: Deposit monew(1) or withdraw monew(2) or check balance(3) or exit(4): ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    System.out.println("Enter the amount you want to deposit :");
                    int deposit = scanner.nextInt();
                    if (deposit < 0) {
                        throw new myException("Deposit amount cannot be negative!");
                    }
                    Balance += deposit;
                    System.out.println("the balance amount is :" + Balance);

                } else if (choice == 2) {
                    System.out.println("Enter the amount you want to withdraw :");
                    int withdraw = scanner.nextInt();
                    scanner.nextLine();
                    if (withdraw > Balance) {
                        throw new myException("Insufficient balance!!!");
                    }
                    if (Balance >= 1000) {

                        Balance -= withdraw;
                        System.out.println(" the balance amount is :" + Balance);
                    } else {
                        System.out.println("Sorry you have low balance!!!");
                    }

                } else if (choice == 3) {
                    System.out.println("the balance amount is :" + Balance);
                } else if (choice == 4) {
                    System.out.println("the banking process is over!!!");
                    break;
                } else {
                    System.out.println("You have selected an invalid option!!!");
                }
            }


        }
        catch(myException e)

    {
        System.out.println("Error: " + e.getMessage());
    }
        finally {
            scanner.close();
        }


    }
}
