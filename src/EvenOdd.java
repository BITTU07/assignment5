import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the numners to check it is even or odd");
        int n= sc.nextInt();
        if ( n % 2 == 0)
        {
            System.out.println(" number is even");
        }
        else {
            System.out.println(" number is odd");
        }
    }


}
