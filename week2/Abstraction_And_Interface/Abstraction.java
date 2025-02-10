abstract class Animal {
    abstract void makeSound();
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog is barking: Woof! Woof!");
    }
}
public class Abstraction{
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Upcasting
        myDog.makeSound();
    }
}
