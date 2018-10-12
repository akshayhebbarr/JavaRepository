import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a name: ");

        // nextInt() reads the next integer from the keyboard
         String str = reader.next();
         System.out.print("Enter age: ");
         int age = reader.nextInt();

        // println() prints the following line to the output screen
        System.out.println("name is: " + str);
        System.out.println("age is: " + age);
    }
}