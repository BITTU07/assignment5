import java.sql.SQLOutput;
import java.util.Scanner;

public class leap {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if (year %400 ==0)
                {
                    System.out.println(" is leap year");
                }
            }
            else {
                System.out.println(" is not leap year");
        }


        }
        else {
            System.out.println(" is leap year");
        }
    }

    }

