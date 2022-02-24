import java.util.Scanner;
class Bonus
{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Salary of Employee");
		int sal=sc.nextInt();
		System.out.println("Enter the Year of Services");
		int yr=sc.nextInt();
		int total=(sal*5)/100;
		int tr=sal+total;
		if(yr>=5)
		{
			System.out.println("Congratulation, You will Get 5% Bonus: "+total+" total is= "+tr);

		}
	}
}