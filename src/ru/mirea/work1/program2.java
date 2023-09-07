package ru.mirea.work1;

import java.util.*;

public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<Integer>();

        int size;
        while(true) {
            System.out.print("Enter size of array: ");
            size = sc.nextInt();
            if (size < 1) {
                System.out.println("Number can't be less than 1");
                continue;
            }
            break;
        }
        int sum = 0;
        while (size > 0) {
            int inp = sc.nextInt();
            array.add(inp);

            sum += inp;

            size--;
        }

        System.out.println("Sum: " + sum + " Max: " + Collections.max(array) + " Min: " + Collections.min(array));
    }
}
