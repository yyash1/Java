import java.util.Scanner;

class Calculator
{
	public static void main(String args[])
	{
		Scanner edm=new Scanner(System.in);
		System.out.println("Enter The first no:");
		int num1= edm.nextInt();
		System.out.println("Enter The Second no:");
		int num2= edm.nextInt();
		System.out.println("1.Addition(1) 2.Subtration(2) 3.Division(3) 4.Multiplication(4) 5.Remainder(5)\nEnter Operation");
		int op= edm.nextInt();
		switch(op)
		{
			case 1:
				System.out.println("Addition of num1 + num2 is:"+(num1+num2));
				break;
			case 2:
				System.out.println("Subtration of num1 - num2 is:"+(num1-num2));
				break;
			case 3:
				System.out.println("Division of num1 / num2 is:"+(num1/num2));
				break;
			case 4:
				System.out.println("Multplication of num1 x num2 is:"+(num1*num2));
				break;
			case 5:
				System.out.println("Remainder of num1 % num2 is:"+(num1%num2));
				break;
			default:
				System.out.println("you entered worng keyword ");
		}
	}
}