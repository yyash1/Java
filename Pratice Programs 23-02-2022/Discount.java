import java.util.Scanner;

class Discount
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Quantity");
		int purchase=sc.nextInt();
		int total=purchase*100;
		int last=total/10;
		last=total-last;
		if(total>1000)
		{
			System.out.println("Congrats, Your are Eligible For 10% Discount.\n Your total Bills is: "+last);
		}
		else
		{
			System.out.println("Thanks For Shopping your total bill is: "+total);
		}

	}
}