import java.util.*;

public class Solution {

    public static List<Integer> jimOrders(List<List<Integer>> orders) {
        List<int[]> customers = new ArrayList<>();
        
        
        for (int i = 0; i < orders.size(); i++) {
            int orderTime = orders.get(i).get(0);
            int prepTime = orders.get(i).get(1);
            int deliveryTime = orderTime + prepTime;
            customers.add(new int[]{deliveryTime, i + 1}); 
        }
        
        
        customers.sort((a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]); 
            }
            return Integer.compare(a[0], b[0]); 
        });
        
        
        List<Integer> result = new ArrayList<>();
        for (int[] customer : customers) {
            result.add(customer[1]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> orders = new ArrayList<>();
        
        
        for (int i = 0; i < n; i++) {
            List<Integer> order = new ArrayList<>();
            order.add(scanner.nextInt());
            order.add(scanner.nextInt());
            orders.add(order);
        }
        
       
        List<Integer> result = jimOrders(orders);
        
        
        for (int customer : result) {
            System.out.print(customer + " ");
        }
        scanner.close();
    }
}
