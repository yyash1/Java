import java.util.Scanner;

 class Month
 {
 	public static void main(String args[])
 	{
 		Scanner ob= new Scanner(System.in);
 		System.out.println("Enter the Month");
 		String moon=ob.next();
 		if((moon.equals("January"))||(moon.equals("january")))
 		{
 			System.out.println("1");
 		}
 		else if((moon.equals("February"))||(moon.equals("february")))
 		{
 			System.out.println("2");
 		}
 		else if((moon.equals("March"))||(moon.equals("march")))
 		{
 			System.out.println("3");
 		}
 		else if((moon.equals("April"))||(moon.equals("april")))
 		{
 			System.out.println("4");
 		}
 		else if((moon.equals("May"))||(moon.equals("may")))
 		{
 			System.out.println("5");
 		}
 		else if((moon.equals("June"))||(moon.equals("june")))
 		{
 			System.out.println("6");
 		}
 		else if((moon.equals("July"))||(moon.equals("july")))
 		{
 			System.out.println("7");
 		}
 		else if((moon.equals("August"))||(moon.equals("august")))
 		{
 			System.out.println("8");
 		}
 		else if((moon.equals("September"))||(moon.equals("september")))
 		{
 			System.out.println("9");
 		}
 		else if((moon.equals("October"))||(moon.equals("October")))
 		{
 			System.out.println("10");
 		}
 		else if((moon.equals("November"))||(moon.equals("November")))
 		{
 			System.out.println("11");
 		}
 		else if((moon.equals("December"))||(moon.equals("december")))
 		{
 			System.out.println("12");
 		}
 		else 
 		{
 			System.out.println("Incorrect Number");
 		}
 	}
 }