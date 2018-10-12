import java.util.Scanner;
public class Const
{
int age;
int id;
void disp()
{
	Scanner read = new Scanner(System.in);
	System.out.println("enter age:");
	int age = read.nextInt();
	System.out.println("Enter id:");
	int id = read.nextInt();
	System.out.println("age is:"+age);
	System.out.println("id is:"+id);
}
public static void main(String args[])
{
	Const obj = new Const();
	obj.disp();
}
}