import java.util.ArrayList;
import java.util.List;

class PrimeSumThread extends Thread {
    private int start, end;
    private long sum = 0;

    public PrimeSumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
    }

    public long getSum() {
        return sum;
    }
}

public class MultiThreadedPrimeSum {
    public static void main(String[] args) throws InterruptedException {
        int limit = 50; /+
        List<PrimeSumThread> threads = new ArrayList<>();
        int chunkSize = limit / numThreads;
        
        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize + 1;
            int end = (i == numThreads - 1) ? limit : (start + chunkSize - 1);
            PrimeSumThread thread = new PrimeSumThread(start, end);
            threads.add(thread);
            thread.start();
        }

        long totalSum = 0;
        for (PrimeSumThread thread : threads) {
            thread.join();
            totalSum += thread.getSum();
        }

        System.out.println("Sum of prime numbers up to " + limit + ": " + totalSum);
    }
}
