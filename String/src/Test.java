// Java program to demonstrate use of a
// string to control a switch statement.
import java.util.Scanner;
public class Test 
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter value:");
        String str = read.nextLine();
        
        switch(str)
        {
            case "one":
                System.out.println("you entered one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("no match");
        }
    }
}