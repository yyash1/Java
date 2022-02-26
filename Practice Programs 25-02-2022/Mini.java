import java.util.Scanner;

class Mini
{
	public static void main(String args[])
	{
		Scanner bt=new Scanner(System.in);
		System.out.println("1.Addition 2.Subtraction 3.Division 4.Multiplicatio\n Enter Your Operation");
		int op =bt.nextInt();
		System.out.println("1.Two 2.Three 3.Four\n Enter your choise");
		int ono =bt.nextInt();
		switch(op)
		{
		case 1:
			switch(ono)
			{
				case 1:
					System.out.println("Enter First number");
					int num1=bt.nextInt();
					System.out.println("Enter Second number");
					int num2=bt.nextInt();
					System.out.println(num1+"+"+num2+"="+(num1+num2));
					break;
				case 2:
					System.out.println("Enter First number");
					int num3=bt.nextInt();
					System.out.println("Enter Second number");
					int num4=bt.nextInt();
					System.out.println("Enter Third number");
					int num5=bt.nextInt();
					System.out.println(num3+"+"+num4+"+"+num5+"="+(num3+num4+num5));
					break;
				case 3:
					System.out.println("Enter First number");
					int num6=bt.nextInt();
					System.out.println("Enter Second number");
					int num7=bt.nextInt();
					System.out.println("Enter Third number");
					int num8=bt.nextInt();
					System.out.println("Enter Fourth number");
					int num9=bt.nextInt();
					System.out.println(num6+"+"+num7+"+"+num8+"+"+num9+"="+(num6+num7+num8+num9));
					break;
				default:
					System.out.println("You enter Invalid Choise");
			}
			break;
		case 2:
			switch (ono) 
			{
				case 1:
					System.out.println("Enter First number");
					int n1=bt.nextInt();
					System.out.println("Enter Second number");
					int n2=bt.nextInt();
					System.out.println(n1+"-"+n2+"="+(n1-n2));
					break;
				case 2:
					System.out.println("Enter First number");
					int n3=bt.nextInt();
					System.out.println("Enter Second number");
					int n4=bt.nextInt();
					System.out.println("Enter Third number");
					int n5=bt.nextInt();
					System.out.println(n3+"-"+n4+"-"+n5+"="+(n3-n4-n5));
					break;
				case 3:
					System.out.println("Enter First number");
					int n6=bt.nextInt();
					System.out.println("Enter Second number");
					int n7=bt.nextInt();
					System.out.println("Enter Third number");
					int n8=bt.nextInt();
					System.out.println("Enter Fourth number");
					int n9=bt.nextInt();
					System.out.println(n6+"-"+n7+"-"+n8+"-"+n9+"="+(n6-n7-n8-n9));
					break;
				default:
					System.out.println("You enter Invalid Choise");
			}
			break;
		case 3:
			switch(ono)
			{
				case 1:
					System.out.println("Enter First number");
					int nu1=bt.nextInt();
					System.out.println("Enter Second number");
					int nu2=bt.nextInt();
					System.out.println(nu1+"/"+nu2+"="+(nu1/nu2));
					break;
				case 2:
					System.out.println("Enter First number");
					int nu3=bt.nextInt();
					System.out.println("Enter Second number");
					int nu4=bt.nextInt();
					System.out.println("Enter Third number");
					int nu5=bt.nextInt();
					System.out.println(nu3+"/"+nu4+"/"+nu5+"="+(nu3/nu4/nu5));
					break;
				case 3:
					System.out.println("Enter First number");
					int nu6=bt.nextInt();
					System.out.println("Enter Second number");
					int nu7=bt.nextInt();
					System.out.println("Enter Third number");
					int nu8=bt.nextInt();
					System.out.println("Enter Fourth number");
					int nu9=bt.nextInt();
					System.out.println(nu6+"/"+nu7+"/"+nu8+"/"+nu9+"="+(nu6/nu7/nu8/nu9));
					break;
				default:
					System.out.println("You enter Invalid Choise");
			}
			break;
		case 4:
			switch(ono)
			{
				case 1:
					System.out.println("Enter First number");
					int nam1=bt.nextInt();
					System.out.println("Enter Second number");
					int nam2=bt.nextInt();
					System.out.println(nam1+"*"+nam2+"="+(nam1*nam2));
					break;
				case 2:
					System.out.println("Enter First number");
					int nam3=bt.nextInt();
					System.out.println("Enter Second number");
					int nam4=bt.nextInt();
					System.out.println("Enter Third number");
					int nam5=bt.nextInt();
					System.out.println(nam3+"*"+nam4+"*"+nam5+"="+(nam3*nam4*nam5));
					break;
				case 3:
					System.out.println("Enter First number");
					int nam6=bt.nextInt();
					System.out.println("Enter Second number");
					int nam7=bt.nextInt();
					System.out.println("Enter Third number");
					int nam8=bt.nextInt();
					System.out.println("Enter Fourth number");
					int nam9=bt.nextInt();
					System.out.println(nam6+"*"+nam7+"*"+nam8+"*"+nam9+"="+(nam6*nam7*nam8*nam9));
					break;
				default:
					System.out.println("You enter Invalid Choise");
			}
			break;	
		default:
			System.out.println("Invalid Choise");
		}
	}
}