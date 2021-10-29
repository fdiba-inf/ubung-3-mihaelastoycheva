package exercise3;
import java.util.Scanner;

public class AngleCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int winkel = input.nextInt();
        char ch = input.next().charAt(0);
        double radiant;
        double grad;

        do{
            if(ch == 'r'){
                radiant = (winkel * 3.14) / 180;
                System.out.println("Angle: " + radiant + ch);
            } else {
                grad = (winkel * 180) / 3.14;
                System.out.println("Angle: " + grad + ch);
            }
            //winkel = input.nextInt();
            ch = input.next().charAt(0);
        } while((ch == 'r') || (ch == 'd'));
    }
}
