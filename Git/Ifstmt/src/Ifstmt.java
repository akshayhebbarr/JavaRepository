import  java.util.Scanner;
public class Ifstmt {
	
public static void main(String args[])
{
	      Scanner read = new Scanner(System.in);
	      System.out.println("enter a:");;
	      int a = read.nextInt();
	      System.out.println("enter b:");
	      int b = read.nextInt();

	      if(a>b)
	      {
	         System.out.println("a is greater");
	      }
	      else if(b>a)
	      {
	    	  System.out.println("b is greater");
	      }
	      else
	      {
	    	  System.out.println("both are equal");
	      }
	}
}