import java.util.*;

public class HighestValuePalindrome {

    public static String highestValuePalindrome(String s, int n, int k) {
        char[] chars = s.toCharArray();
        boolean[] changed = new boolean[n]; 

        int left = 0, right = n - 1;
        int changesNeeded = 0;

        
        while (left < right) {
            if (chars[left] != chars[right]) {
                char maxChar = (char) Math.max(chars[left], chars[right]);
                chars[left] = chars[right] = maxChar;
                changed[left] = changed[right] = true;
                k--; 
            }
            left++;
            right--;
        }

        if (k < 0) return "-1"; 
        left = 0;
        right = n - 1;
        while (left <= right) {
            if (left == right) { 
                if (k > 0) chars[left] = '9';
            } else {
                if (chars[left] != '9') {
                    if (changed[left] || changed[right]) {
                        if (k >= 1) {
                            chars[left] = chars[right] = '9';
                            k--;
                        }
                    } else {
                        if (k >= 2) {
                            chars[left] = chars[right] = '9';
                            k -= 2;
                        }
                    }
                }
            }
            left++;
            right--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        System.out.println(highestValuePalindrome(s, n, k));
        sc.close();
    }
}
