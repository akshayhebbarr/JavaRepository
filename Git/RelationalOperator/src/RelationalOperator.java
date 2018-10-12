import java.util.Scanner;
class RelationalOperator {
    public static void main(String[] args) {
    	
    	int num1,num2;
    	System.out.println("enter two numbers");
    	 Scanner input = new Scanner(System.in);
		    num1 = input.nextInt();
		    num2 = input.nextInt();
        if (num1 > num2)
    	{
    		System.out.println("num1 is greater than num2.");
    	}
    	else
    	{
    		System.out.println("num2 is greater than num1.");
    	}
        if (num1 == num2)
        {
        	System.out.println("they are equal");
        }

}
}