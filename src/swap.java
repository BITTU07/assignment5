import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the number first number to swap");
        int a= sc.nextInt();
        System.out.println(" enter the number second number to swap");
        int b= sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println(" after swaping " +a);
        System.out.println(" after swaping " +b);


    }
}
