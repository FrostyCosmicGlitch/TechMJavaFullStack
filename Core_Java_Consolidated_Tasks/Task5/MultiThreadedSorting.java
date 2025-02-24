import java.util.Arrays;

class SortThread extends Thread {
    private int[] arr;

    public SortThread(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        Arrays.sort(arr);
    }

    public int[] getSortedArray() {
        return arr;
    }
}

public class MultiThreadedSorting {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = {5, 2, 9, 1, 6, 7};
        SortThread sortThread = new SortThread(arr);
        
        sortThread.start();
        sortThread.join();
        
        System.out.println("Sorted Array: " + Arrays.toString(sortThread.getSortedArray()));
    }
}
