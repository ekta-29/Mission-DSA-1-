import java.util.*;

public class PriyankaAndToys {

    public static int toys(int[] weights) {
        Arrays.sort(weights);  
        int containers = 0;
        int i = 0;
        int n = weights.length;

        while (i < n) {
            containers++;
            int containerLimit = weights[i] + 4;  
            i++;
            
          
            while (i < n && weights[i] <= containerLimit) {
                i++;
            }
        }

        return containers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] weights = new int[n];

        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        System.out.println(toys(weights));
        scanner.close();
    }
}
