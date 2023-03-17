import java.util.Scanner;

public class CQR {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the value of the dividend");
        int dividend = sc.nextInt();
        System.out.println(" Enter the value of divisior");
        int divisor = sc.nextInt();

        int quotient = dividend/divisor;
        int remainder = dividend%divisor;
        System.out.println(" your quotient is  " +quotient);
        System.out.println(" your reminder is  " +remainder);
    }
}
