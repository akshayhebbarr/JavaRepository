import java.util.Scanner;
public class SwapNumber {

    public static void main(String[] args) {

        

        System.out.println("--Before swap--");
        System.out.println("Enter first number:");
        Scanner read = new Scanner(System.in);
        int first = read.nextInt();
        System.out.println("First number = " + first);
        System.out.println("Enter second number:");
        int second = read.nextInt();
        System.out.println("Second number = " + second);

        // Value of first is assigned to temporary
        int temp = first;

        // Value of second is assigned to first
        first = second;

        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temp;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}