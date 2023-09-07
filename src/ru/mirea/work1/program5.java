package ru.mirea.work1;

import java.math.BigInteger;
import java.util.*;

public class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        BigInteger factorial = program5.getFactorial(n);

        System.out.println(factorial);
    }

    public static BigInteger getFactorial(int n) {
        BigInteger result = BigInteger.valueOf(1);
        for(int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
