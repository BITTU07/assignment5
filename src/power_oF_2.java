import java.util.Scanner;

public class power_oF_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println(" enter the number that you want tot print the table of 2");
        int power = sc.nextInt();
        if ( power < 31)
        {
            for ( int i=0; i < power; i++)
            {
                int ans = 2*i;
                System.out.println("2^" + i + "=" + ans);
            }
        }
    }
}
