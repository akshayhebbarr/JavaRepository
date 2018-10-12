
public class Overriding {
	void addition()
	{
		int a=10, b=20;
		System.out.println("this is addition"+a+b);
				
	}
}
	class child extends Overriding {
		void subtraction()
		{
			int a=15, b=12;
			System.out.println("multiplication"+a*b);
		}
	public static void main(String args[])
	{
		child obj = new child();
		obj.subtraction();
	}
}
	
