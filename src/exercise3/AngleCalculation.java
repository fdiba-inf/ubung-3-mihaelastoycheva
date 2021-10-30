package exercise3;

import java.util.Scanner;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double winkel;
        char ch;
        do {
          winkel = input.nextDouble();
          ch = input.next().charAt(0);

          if (ch == 'r') {
            double convertedValue = winkel / Math.PI * 180;
            System.out.println("Angle: " + convertedValue + "d");

          }else if (ch == 'd') {
            double convertedValue = winkel * Math.PI / 180;
            System.out.println("Angle: " + convertedValue + "r");
          }

        } while (ch == 'r' || ch == 'd' );
    }

}