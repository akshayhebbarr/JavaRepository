import java.util.Scanner;
public class LargestNumber {

    public static void main(String[] args) {

        
        Scanner read = new Scanner(System.in);
        System.out.println("Enter n1:");
        int n1 = read.nextInt();
        System.out.println("Enter n2:");
        int n2 = read.nextInt();
        System.out.println("Enter n3:");
        int n3 = read.nextInt();
        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}