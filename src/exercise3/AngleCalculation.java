package exercise3;
import java.util.Scanner;

public class AngleCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int winkel;
        char ch;
        double radiant;
        double grad;

        do{
          winkel = input.nextInt();
          ch = input.next().charAt(0);
            if(ch == 'r'){
                radiant = (winkel * Math.PI) / 180;
                System.out.println("Angle: " + radiant + "d");
            } else {
                grad = (winkel * 180) / Math.PI;
                System.out.println("Angle: " + grad + "r");
            }
        } while((ch == 'r') || (ch == 'd'));
    }
}
