
public class Overload {
	void disp(int a, float b)
	{
		System.out.println("level 1");
	}
	void disp(int c,int d,int e)
	{
		System.out.println("level 2");
	}
	public static void main(String args[])
	{
		Overload obj = new Overload();
        obj.disp(10,10,50);	
	}
	}
