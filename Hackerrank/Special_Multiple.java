import java.util.*;

public class SpecialMultiple {

  
    static String findSpecialMultiple(int n) {
        if (n == 0) return "0";

        
        Queue<String> q = new LinkedList<>();
        q.add("9"); 
        while (!q.isEmpty()) {
            String current = q.poll();
       
            int mod = 0;
            for (char c : current.toCharArray()) {
                mod = (mod * 10 + (c - '0')) % n;
            }
            if (mod == 0) return current; 


            q.add(current + "0");
            q.add(current + "9");
        }
        return ""; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(findSpecialMultiple(n));
        }
        sc.close();
    }
}
