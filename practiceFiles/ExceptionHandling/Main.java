import java.util.function.Consumer;

//📝 Create an interface called Vehicle with a method move(). Implement it in two classes: Car and Bicycle and override move() with appropriate messages.
/*
interface Vehicle{
    void move();
}
class Car implements Vehicle{
    public void move(){
        System.out.println("lets move this car!!!!!");
    }
}

class Bicycle implements Vehicle{
    public void move(){
        System.out.println("lets move this bi-cycle!!!!!");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle c=new Car();
        Vehicle b=new Bicycle();
        c.move();
        b.move();
    }
}

 //next program


interface Animal{
    void makeSound();
}
class Dog implements Animal{
    public void makeSound(){
        System.out.println("Woof! Woof!");
    }
}
class Cat implements Animal{
    public void makeSound(){
        System.out.println("Meow! Meow!");
    }
}
public class Main{
    public static void main(String[] args){
        Animal d=new Dog();
        Animal c=new Cat();
        d.makeSound();
        c.makeSound();
    }
}




interface Flyable{
    void fly();
}
interface Swimable{
    void swim();
    default void floatOnWater(){
        System.out.println("Floating on water....");
    }
}

class Duck implements Flyable,Swimable{
    @Override
    public void fly(){
        System.out.println("The duck is flying!!!");
    }

    @Override
    public void swim() {
        System.out.println("The duck is swimming!!!");
    }
}
public class Main{
    public static void main(String [] args){
        Duck d=new Duck();

        d.fly();
        d.swim();
        d.floatOnWater();
    }
}


//1️⃣ Create an interface MathUtils with a static method square(int num) that returns the square of a number.
//2️⃣ Implement a Calculator class that calls MathUtils.square(5) inside main().
//3️⃣ Print the result.

interface MathUtils{
    static int square(int num){
        return num*num;
    }
}

public class Main {
    public static void main(String[] args){
        int sq=MathUtils.square(2);
        System.out.println("the square of the number is "+sq);
    }

}



interface Converter{
    static double fahrenheitToCelsius(double fahrenheit){
        double celsius=(fahrenheit-32)*(5.0/9.0);
        return celsius;
    }
}
public class Main {
    public static void main(String [] args){
        double celsius=Converter.fahrenheitToCelsius(100.0);
        System.out.println("the converted temperature is :"+ celsius);
    }
}

 */
/*
Task: Use a private method in an interface
1️⃣ Create an interface Logger with:

A static method logInfo(String message) that logs an info message.
A static method log(String level, String message) that formats the log message.
        2️⃣ Implement a class ConsoleLogger that uses logInfo() inside main().

        3️⃣ Print the formatted log message.

💡 Hint: Private methods inside an interface cannot be accessed outside the interface but can be called inside default/static methods.



interface Logger{
    static void logInfo(String message){
        log(message);
    }
    static void log(String message){
        System.out.println("[INFO] "+message);
    }
}
class ConsoleLogger{
    void startLogging(){
        Logger.logInfo("There seems to be an error");

    }
}
public class Main{
    public static void main(String [] args){
        ConsoleLogger l=new ConsoleLogger();
        l.startLogging();
    }
}


// lamda expression

interface MathOperation{
    int operate(int a, int b);
}

public class Main{
    public static void main(String [] args){
        MathOperation add=(a,b) -> a+b;
        MathOperation mul=(a,b) -> a*b;
        System.out.println(add.operate(10,20));
        System.out.println(mul.operate(1,10));
    }
}




interface Greeting{
    public String sayHello(String message);
}
public class Main{
    public static void main(String [] args){
        Greeting mes=(message) -> {
            System.out.println("message:"+message);
            return "Greetings Sent!";
        };
        System.out.println(mes.sayHello("Hello, Lambda!"));
    }
}

//lamda with static method

import java.util.function.Function;

class MathUtils{
    static int square(int num){
        return num*num;
    }
}
public class Main{
    public static void main(String [] args){
        Function<Integer,Integer> findSquare= MathUtils::square;
        int result=findSquare.apply((5));
        System.out.println(result);
    }
}


//lamda with method reference to an instance method
class Printer {
    void printMessage(String message) {
        System.out.println("Message: "+message);
    }
}
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Consumer<String> displayMessage=printer::printMessage;
        displayMessage.accept("This is a message");
    }
}

 */
//functional interface task

interface MathOperation{
    int operate(int a, int b);

}
public class Main{
    public static void main(String[] args){
        MathOperation add=(a,b) -> a+b;
        MathOperation sub=(a,b)->a-b;
        MathOperation mul=(a,b)->a*b;
        System.out.println("the addition of the numbers are :"+ add.operate(20,40));
        System.out.println("the subtraction of the numbers are :"+ sub.operate(60,40));
        System.out.println("the multiplication of the numbers are :"+ mul.operate(20,40));
    }
}
