import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the letter to checkl wether it is vowel or consonant");
        String str= sc.nextLine();
        if ( str == "a" || str == "e" || str == "i" || str == "o" || str == "u")
        {
            System.out.println(" vowel");
        }
        else {
            System.out.println(" is consonant ");
        }
    }
}
