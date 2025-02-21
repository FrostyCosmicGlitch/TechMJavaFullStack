import java.util.Scanner;
/*
class vehicle{
    String Brand;
    int speed;
    void displayInfo() {
        System.out.println("the brand of the car is : "+Brand+" the speed of the car is :"+speed);
    }
}
class Car extends vehicle {
    void honk() {
        System.out.println(Brand + " is honking!!!");
    }
}
public class Main {
    public static void main(String[] args) {
            Car car = new Car();
            car.Brand = "Audi";
            car.speed = 300;
            car.displayInfo();
            car.honk();
    }
}

 */

class BankAccount{
    String AccountHolderName;
    double AccountBalance;
    void deposit(double amount){
        AccountBalance+=amount;
    }
    void withdraw(double amount){
        AccountBalance-=amount;
    }
    void displayBalance() {
        System.out.println(AccountHolderName + "'s Balance: " + AccountBalance);
    }
}

class SavingsAccount extends BankAccount{
    double InterestRate;
    void addInterest(){
        AccountBalance += AccountBalance * InterestRate;

    }
}

class CheckingAccount extends BankAccount{
    double overDraftLimit;
    void withdraw(double amount){
        if(AccountBalance - amount >= -overDraftLimit){
            AccountBalance-=amount;
            System.out.println("withdraw done!");
        }
        else{
            System.out.println("your limit is low!!!");
        }
    }

}

public class Main {
    public static void main(String [] args){
        SavingsAccount savings = new SavingsAccount();
        savings.AccountHolderName = "Alice";
        savings.AccountBalance = 5000;
        savings.deposit(1000);
        savings.addInterest();
        savings.displayBalance();


    }
}
