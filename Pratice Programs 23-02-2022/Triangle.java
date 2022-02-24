import java.util.Scanner;

class Triangle
{
	public static void main(String args[])
	{
		Scanner ds= new Scanner(System.in);
		System.out.println("Enter Side 1");
		int s1=ds.nextInt();
		System.out.println("Enter Side 2");
		int s2=ds.nextInt();
		System.out.println("Enter Side 3");
		int s3=ds.nextInt();
		if(s1==s2 && s2==s3)
		{
			System.out.println("The Triangle is Equilateral Triangle");
		}
		else if(s1==s2 || s2==s3 || s1==s3)
		{
			System.out.println("The Triangle is Isosceles Triangle");
		}
		else
		{
			System.out.println("The Triangle is scalene Triangle");
		}
	}
}