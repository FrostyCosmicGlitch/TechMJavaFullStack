import java.util.*;

class Student {
    String name;
    int[] marks;
    int total;
    double average;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        this.total = Arrays.stream(marks).sum();
        this.average = (double) total / marks.length;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter number of subjects: ");
            int subjects = scanner.nextInt();

            int[] marks = new int[subjects];
            System.out.print("Enter marks: ");
            for (int j = 0; j < subjects; j++) {
                marks[j] = scanner.nextInt();
            }
            scanner.nextLine(); 
            students.add(new Student(name, marks));
        }

        students.sort(Comparator.comparingInt(s -> s.total));

        System.out.println("\nSorted List:");
        for (Student s : students) {
            System.out.println(s.name + " - Total: " + s.total + ", Average: " + s.average);
        }
    }
}
