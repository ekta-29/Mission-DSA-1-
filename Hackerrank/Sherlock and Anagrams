import java.util.*;

public class SherlockAndAnagrams {

    static int sherlockAndAnagrams(String s) {
        Map<String, Integer> map = new HashMap<>();
        int n = s.length();

        
        for (int len = 1; len <= n; len++) { 
            for (int i = 0; i <= n - len; i++) {
                String sub = s.substring(i, i + len);
                char[] chars = sub.toCharArray();
                Arrays.sort(chars); 
                String key = new String(chars);
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }

        int countPairs = 0;
        for (int freq : map.values()) {
            if (freq > 1) {
                countPairs += (freq * (freq - 1)) / 2; 
            }
        }

        return countPairs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(sherlockAndAnagrams(s));
        }
        sc.close();
    }
}
