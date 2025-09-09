import java.util.*;

public class MinimumLoss {

    static long minimumLoss(long[] prices) {
        int n = prices.length;
       
        long[][] priceWithIndex = new long[n][2];
        for (int i = 0; i < n; i++) {
            priceWithIndex[i][0] = prices[i];
            priceWithIndex[i][1] = i;
        }
        Arrays.sort(priceWithIndex, (a, b) -> Long.compare(a[0], b[0]));

        long minLoss = Long.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            long higherPrice = priceWithIndex[i][0];
            long lowerPrice = priceWithIndex[i - 1][0];
            long higherIndex = priceWithIndex[i][1];
            long lowerIndex = priceWithIndex[i - 1][1];
            if (higherIndex < lowerIndex) {
                minLoss = Math.min(minLoss, higherPrice - lowerPrice);
            }
        }

        return minLoss;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] prices = new long[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextLong();
        }

        System.out.println(minimumLoss(prices));
        sc.close();
    }
}
