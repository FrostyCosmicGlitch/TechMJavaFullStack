import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int size = (arr.length + 1) / 2;
        int[] altArr = new int[size];

        for (int i = 0, j = 0; i < arr.length; i += 2, j++) {
            altArr[j] = arr[i];
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Alternative Elements Array: " + Arrays.toString(altArr));
    }
}
