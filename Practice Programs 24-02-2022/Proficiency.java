import java.util.Scanner;

class Proficiency
{
	public static void main(String args[])
	{
		Scanner vai=new Scanner(System.in);
		System.out.println("Enter Your Level");
		int num=vai.nextInt();
		switch(num)
		{
			case 1:
				System.out.println("Begginer");
				break;
			case 2:
				System.out.println("Elementary");
				break;
			case 3:
				System.out.println("Intermediate");
				break;
			case 4:
				System.out.println("Advanced");
				break;
			default:
				System.out.println("Incorrect Choice");
		}
	}

}