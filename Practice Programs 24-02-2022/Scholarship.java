import java.util.Scanner;

class Scholarship
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Male(m) Female(f)\nEnter your Gender");
		char gum= ob.next().charAt(0);
		System.out.println("Enter your Year (eg:3rd,4th)");
		int yr=ob.nextInt();
		switch(gum)
		{ 
		 case 'f':
		 	switch(yr)
		  	{
		  	 case 3:
		  		System.out.println("Your are Eligible for Scholarship");
		  		break;
		  	default:
		  		System.out.println("Your are not Eligible for Scholarship");
		  		break;
		   	}
		  	break;
			default:
				System.out.println("Your are not Eligible for Scholarship");
		   	break;
		}

	}
}
