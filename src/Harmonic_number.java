import java.util.Scanner;

public class Harmonic_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the value of n to find harmonic number");
        int harmonicValue = sc.nextInt();
        double harmonicNumber =0.0;

       if (harmonicValue!=0)
        {
         for ( int i=1; i <= harmonicValue; i++)
         {
             harmonicNumber += (double) 1 / i;
             System.out.println(harmonicNumber);
         }
        }
        else {
            System.out.println(" please enter the vales gretaer then o ");
        }
    }
}
