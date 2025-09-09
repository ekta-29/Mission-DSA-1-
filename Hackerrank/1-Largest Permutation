import java.util.*;

public class Solution {

    public static List<Integer> largestPermutation(int k, List<Integer> arr) {
       
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            indexMap.put(arr.get(i), i);
        }

        int n = arr.size();
        int remainingSwaps = k;

       
        for (int i = 0; i < n && remainingSwaps > 0; i++) {
            int expectedValue = n - i;
            if (!arr.get(i).equals(expectedValue)) {
               
                int expectedIndex = indexMap.get(expectedValue);

             
                int temp = arr.get(i);
                arr.set(i, expectedValue);
                arr.set(expectedIndex, temp);

                
                indexMap.put(temp, expectedIndex);
                indexMap.put(expectedValue, i);

               
                remainingSwaps--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        List<Integer> result = largestPermutation(k, arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
