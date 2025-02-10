import java.util.Scanner;

public class MethodOverloading {
    public MethodOverloading() {
    }

    void add(int a, int b) {
        int sum = a + b;
        System.out.println("the sum of the two numbers are " + sum);
    }

    void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("the sum of the three numbers are " + sum);
    }

    void add(double a, double b) {
        double sum = a + b;
        System.out.println("the sum of the two numbers are " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the option: ");
        MethodOverloading calculate = new MethodOverloading();
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("enter a:");
            int a = scanner.nextInt();
            System.out.println("enter b:");
            int b = scanner.nextInt();
            calculate.add(a, b);
        } else if (choice == 2) {
            System.out.println("enter a:");
            int a = scanner.nextInt();
            System.out.println("enter b:");
            int b = scanner.nextInt();
            System.out.println("enter c:");
            int c = scanner.nextInt();
            calculate.add(a, b, c);
        } else if (choice == 3) {
            System.out.println("enter a:");
            double a = scanner.nextDouble();
            System.out.println("enter b:");
            double b = scanner.nextDouble();
            calculate.add(a, b);
        } else {
            System.out.println("not a valid option");
        }

        scanner.close();
    }
}
