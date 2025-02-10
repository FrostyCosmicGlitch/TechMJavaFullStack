class User {
    private String name;
    private int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Same reference
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return age == user.age && name.equals(user.name);
    }
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}
class SecondUser {
    private String name;
    private int age;
    public SecondUser(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
}

public class ObjectClass {
    public static void main(String[] args) {
        User user1 = new User("Alice", 25);
        User user2 = new User("Alice", 25);
        User user3 = new User("Bob", 30);
        SecondUser secondUser1 = new SecondUser("Alice", 25);
        SecondUser secondUser2 = new SecondUser("Alice", 25);
        System.out.println("User1: " + user1);  // Uses overridden toString()
        System.out.println("SecondUser1: " + secondUser1); // Uses default toString()
        System.out.println("user1.equals(user2): " + user1.equals(user2)); // true (compares values)
        System.out.println("secondUser1.equals(secondUser2): " + secondUser1.equals(secondUser2)); // false (default Object class comparison)
        System.out.println("user1.hashCode(): " + user1.hashCode());
        System.out.println("user2.hashCode(): " + user2.hashCode());
        System.out.println("user3.hashCode(): " + user3.hashCode());
    }
}
