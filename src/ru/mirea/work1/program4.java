package ru.mirea.work1;

public class program4 {
    public static void main(String[] args) {
        int n = 10;

        double series[] = new double[n];
        for(int i = 1; i <= series.length; i++) {
            series[i-1] = 1/(double)i;
        }

        System.out.print("Series: ");
        for(int i = 0; i < series.length; i++) {
            System.out.print(series[i] + ", ");
        }
        System.out.print('\n');
    }
}
