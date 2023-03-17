import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a= Math.random();
        System.out.println(" how many times  you want to flip coin");
        int turns= sc.nextInt();
        int head =0;
        int tail =0;
        for ( int i=1; i<=turns; i++)
        {
            if (Math.random() < 0.5) {
                head ++;

            }else{
                tail ++;

            }
        }
        System.out.println(" you got head "  +head +" times");
        System.out.println(" you got tail " +tail +" times");
    }
    }

