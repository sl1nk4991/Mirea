package ru.mirea.work1;

public class program1 {
    public static void main(String[] args) {
        int array[] = {5, 8, 12, 17, 3};

        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        int avg = sum / array.length;

        System.out.println("Sum: " + sum + " Average: " + avg);
    }
}
