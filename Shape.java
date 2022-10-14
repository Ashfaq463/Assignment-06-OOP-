import java.util.Scanner;

public class Shape {
	protected double num1,num2;
	
	Scanner sc = new Scanner(System.in);
	
	public void getdata()
	{
		
		System.out.println("Enter num1 : ");
		num1 = sc.nextDouble();
	}
	public void getdata1()
	{
		System.out.println("Enter num1 : ");
		num1 = sc.nextDouble();
		
		System.out.println("Enter num2 : ");
		num2 = sc.nextDouble();
	}
	public void display()
	{
		System.out.println("The area is : ");
	}

}
