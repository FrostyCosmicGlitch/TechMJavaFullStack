/*

//Task 2

abstract class Vehicle{
    abstract void startEngine();
}
class Car extends Vehicle{
    void startEngine(){
        System.out.println("Car engine started");
    }
}
class Bike extends Vehicle{
    void startEngine(){
        System.out.println("Bike engine started");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle c=new Car();
        Vehicle b=new Bike();
        c.startEngine();
        b.startEngine();
    }
}


abstract class Shape{
    abstract void calculateArea();
    void displayShape(){
        System.out.println("This is a shape");
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    void calculateArea(){
        double area=Math.PI*this.radius*this.radius;
        System.out.println("The area of the circle is :"+area);
    }

}
class Rectangle extends Shape{
    double length;
    double breadth;
    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    void calculateArea(){
        double area=length*breadth;
        System.out.println("The area of the rectangle is :"+area);
    }
}


public class Main {
    public static void main(String[] args) {
        Shape c = new Circle(2);
        Shape r = new Rectangle(2, 4);
        c.displayShape();
        c.calculateArea();
        r.displayShape();
        r.calculateArea();
    }
}

*/
// task 2
abstract class Employee{
    String EmployeeName;
    int EmployeeID;
    Employee(String EmployeeName,int EmployeeID){
        this.EmployeeID=EmployeeID;
        this.EmployeeName=EmployeeName;
    }
    void displayInfo(){
        System.out.println("the name is :"+EmployeeName+"the id is :"+ EmployeeID);
    }
}
class Manager extends Employee{
    Manager(String EmployeeName, int EmployeeID) {
        super(EmployeeName, EmployeeID); 
    }
    void manageTeam(){
        System.out.println("Managing team ");
    }

}

class Developer extends Employee{
    Developer(String EmployeeName, int EmployeeID) {
        super(EmployeeName, EmployeeID);  
    }
    void developCode(){
        System.out.println("Developing Code");
    }
}

public class Main{
    public static void main(String [] args){
        Manager m=new Manager("nani ",1);
        Developer d= new Developer("buzz ",2);
        m.displayInfo();
        m.manageTeam();
        d.displayInfo();
        d.developCode();
    }
}
