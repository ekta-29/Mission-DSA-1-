import java.util.Scanner;

public class SumVsXOR {

    static long sumXor(long n) {
        if (n == 0) return 1; 
        long countZeroBits = 0;
        long temp = n;
        while (temp > 0) {
            if ((temp & 1) == 0) countZeroBits++; 
            temp >>= 1;
        }

        return 1L << countZeroBits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(sumXor(n));
        sc.close();
    }
}

