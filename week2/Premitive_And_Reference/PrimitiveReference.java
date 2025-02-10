class PrimitiveReference {
    public static void modify(int num, int[] arr) {
        num = 20;
        arr[0] = 99;
    }

    public static void main(String[] args) {
        int number = 10;
        int[] numbersArray = {1, 2, 3};

        System.out.println("Before method call:");
        System.out.println("Integer: " + number);
        System.out.println("Array: " + numbersArray[0]);

        modify(number, numbersArray);

        System.out.println("\nAfter method call:");
        System.out.println("Integer: " + number);
        System.out.println("Array: " + numbersArray[0]);
    }
}
