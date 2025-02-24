import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {1, 2, 3};
        Integer[][] deepArr1 = {{1, 2}, {3, 4}};
        Integer[][] deepArr2 = {{1, 2}, {3, 4}};

        System.out.println("equals() Comparison: " + Arrays.equals(arr1, arr2));
        System.out.println("deepEquals() Comparison: " + Arrays.deepEquals(deepArr1, deepArr2));

        Integer[][] deepArr3 = {{1, 2}, {3, 5}};
        System.out.println("deepEquals() with Different Arrays: " + Arrays.deepEquals(deepArr1, deepArr3)); 
    }
}
