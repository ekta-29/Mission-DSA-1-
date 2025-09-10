import java.util.*;

public class NonDivisibleSubset {

    public static int nonDivisibleSubset(int k, int[] s) {
        int[] remainderCount = new int[k];
        
        
        for (int num : s) {
            remainderCount[num % k]++;
        }
        
        int result = 0;
        
       
        if (remainderCount[0] > 0) result = 1;
        
        
        for (int i = 1; i <= k / 2; i++) {
            if (i != k - i) {
                result += Math.max(remainderCount[i], remainderCount[k - i]);
            }
        }
        
        
        if (k % 2 == 0 && remainderCount[k / 2] > 0) {
            result += 1;
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] s = new int[n];
        
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }
        
        System.out.println(nonDivisibleSubset(k, s));
        scanner.close();
    }
}
