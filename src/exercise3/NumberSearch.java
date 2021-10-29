package exercise3;

import java.util.Scanner;

public class NumberSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = 5;
        int number2 = 6;

        for(int i = 100; i < 400; i++){
            if(i%number1==0 && i%number2==0){
                System.out.printf(i+" ");
            }
        }
        //System.out.println("");
        for(int i = 400; i < 700; i++){
            if(i%number1==0 && i%number2==0){
                System.out.printf(i+" ");
            }
        }
        //System.out.println("");
        for(int i = 700; i < 1000; i++){
            if(i%number1==0 && i%number2==0){
                System.out.printf(i+" ");
            }
        }
    }
}
