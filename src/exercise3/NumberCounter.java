package exercise3;

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int positive = 0;
        int negative = 0;
        int sum = 0;
        int average = 0;

        while(n != 0){
            if(n > 0){
                positive++;
            } else{
                negative++;
            }
            n = input.nextInt();
            sum += n;
            average = sum / (positive + negative);
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
