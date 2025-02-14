import java.util.Scanner;
public class Encapsulation{
    private String name;
    private int age;
    private String grade;
    public Encapsulation(String name, int age ,String grade){
        this.name=name;
        setAge(age);
        setGrade(grade);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age<0){
            System.out.println("you have given an invalid age...setting default age to 0");
            this.age=0;
        }
        else{
            this.age=age;
        }
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade (String grade){
        this.grade=grade;
    }
    public void display(){
        System.out.println("the name is " +name+"   the age is "+age +" the grade is "+grade);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your name: ");
        String name=scanner.nextLine();
        System.out.println("enter your age: ");
        int age=scanner.nextInt();
        scanner.nextLine();

        System.out.println("enter your grade: ");
        String grade=scanner.nextLine();

        Encapsulation s=new Encapsulation(name,age,grade);
        s.display();
        scanner.close();

    }

}
