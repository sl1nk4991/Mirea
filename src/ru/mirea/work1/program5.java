package ru.mirea.work1;

import java.math.BigInteger;
import java.security.InvalidParameterException;
import java.util.*;

public class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        while (true) {
            System.out.print("Enter number: ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("Number can't be negative");
                continue;
            }
            break;
        }

        BigInteger factorial = BigInteger.valueOf(0);
        try {
            factorial = program5.getFactorial(n);
        } catch (InvalidParameterException e) {
            System.out.println(e.toString());
            System.exit(1);
        }

        System.out.println(factorial);
    }

    public static BigInteger getFactorial(int n) {
        if(n < 0)
            throw new InvalidParameterException("number can't be less then 0");
        BigInteger result = BigInteger.valueOf(1);
        for(int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
