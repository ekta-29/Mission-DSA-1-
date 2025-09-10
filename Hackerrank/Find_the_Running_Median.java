import java.util.*;

public class RunningMedian {

    public static void runningMedian(int[] arr) {
        PriorityQueue<Integer> lowerHalf = new PriorityQueue<>(Collections.reverseOrder()); 
        PriorityQueue<Integer> upperHalf = new PriorityQueue<>(); 
        for (int num : arr) {
            
            if (lowerHalf.isEmpty() || num <= lowerHalf.peek()) {
                lowerHalf.offer(num);
            } else {
                upperHalf.offer(num);
            }

           
            if (lowerHalf.size() > upperHalf.size() + 1) {
                upperHalf.offer(lowerHalf.poll());
            } else if (upperHalf.size() > lowerHalf.size()) {
                lowerHalf.offer(upperHalf.poll());
            }

            
            double median;
            if (lowerHalf.size() == upperHalf.size()) {
                median = (lowerHalf.peek() + upperHalf.peek()) / 2.0;
            } else {
                median = lowerHalf.peek();
            }

            System.out.printf("%.1f\n", median);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        runningMedian(arr);
        scanner.close();
    }
}
