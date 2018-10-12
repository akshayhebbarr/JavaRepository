
public class SwapNum {
public static void main(String args[])
{
	int x=5, y=10;
	System.out.println("Swapping without temp");
	x = x + y;
	y = x - y;
	x = x - y;
	System.out.println("x:"+x);
	System.out.println("y:"+y);
}
}
