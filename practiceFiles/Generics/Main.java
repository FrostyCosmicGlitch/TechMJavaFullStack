/*

class Container<T> {
    private T value;
    public void setValue( T value){
        this.value=value;
    }
    public T getValue(){
        return value;
    }
}




public class Main {
    public static void main(String[] args) {
        Container<Integer> num=new Container<>();
        num.setValue(369);
        System.out.println("The number is "+num.getValue());
        Container<String> Str=new Container<>();
        Str.setValue("Hello People!");
        System.out.println("The string is "+Str.getValue());

    }
}

 */

// Generic with pair class Task 2

class Pair<T,U>{
    private T first;
    private U second;
    public Pair(T first, U second){
        this.first=first;
        this.second=second;
    }
    public T getFirst(){
        return first;
    }
    public U getSecond(){
        return second;
    }
    public void display(){
        System.out.println("Pair: " +first+","+second);
    }
}
public class Main{
    public static void main(String [] args){
        Pair<String,Integer> person=new Pair<>("Hannah", 22);
        person.display();
        Pair<Double,Double> cordinates=new Pair<>(30.5,22.3);
        cordinates.display();
    }
}
