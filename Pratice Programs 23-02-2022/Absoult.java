import java.util.Scanner;
class Absoult
{
 	public static void main(String[] args) 
	{
		Scanner ola= new Scanner(System.in);
		System.out.println("Enter the number");
		int num= ola.nextInt();
		if (num<0)
		{
			System.out.println("Sorry, but Entered number is Negative");
			System.out.println("So,it converted in Positive \n"+(num*(-1)));
			System.out.println("Now you ready go...!");
		}
		else
		{
			System.out.println("The Entered number is Positive\n"+num);
			System.out.println("You ready go..!");
		}
	}
	
}