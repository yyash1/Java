import java.util.Scanner;

class Attend
{
	public static void main(String args[])
	{
		Scanner old=new Scanner(System.in);
		System.out.println("Enter the Classes you Attend Out of 200(Classes)");
		int pre= old.nextInt();
		int total=pre/2;
		// int total=(pre/200)*100;
		if(pre<=200 && pre>=100)
		{
			if(total<75)
			{
				System.out.println("Sorry, but you are not Eligible for Exam");
				System.out.println("Your attendace is just "+total+"%");
				System.out.println("Contact with your class teacher and also Principal");
			}
			else
			{
				System.out.println("Your are Eligible for Exam\n Good Boy your attendace is "+total+"%");
			}
		}
		else{
			System.out.println("You are Hopeless student, Immediately goto Principal Cabin");
		}
	}
}