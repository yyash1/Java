import java.util.Scanner;

class Area
{
	public static void main(String args[])
	{
		Scanner ot = new Scanner(System.in);
		System.out.println("1.Area 2.Volume\n Enter Your Choise");
		int opp=ot.nextInt();
		switch(opp)
		{
		case 1:
			System.out.println("1.Area of a Triangle\n 2.Area of a Rectangle\n 3.Area of a Square\n 4.Area of a Circle\n Enter Your Choise");
			int opp1=ot.nextInt();
			switch(opp1)
			{
			case 1:
				System.out.println("Enter the lenght of Triangle");
				int trh=ot.nextInt();
				System.out.println("Enter the Base of Triangle");
				int trb=ot.nextInt();
				System.out.println("Area of Triangle is: "+((trh*trb)/2));
				break;
			case 2:
				System.out.println("Enter the lenght of Rectangle");
				int rel=ot.nextInt();
				System.out.println("Enter the Base of Rectangle");
				int reb=ot.nextInt();
				System.out.println("Area of Rectangle is: "+(rel*reb));
				break;
			case 3:
				System.out.println("Enter the side of Square");
				int sl=ot.nextInt();
				System.out.println("Area of Square is: "+(sl*sl));
				break;
			case 4:
				System.out.println("Enter the Radius of Circle");
				int rl=ot.nextInt();
				System.out.println("Area of Circle is: "+(3.142*rl*rl));
				break;
			default:
				System.out.println("Invalid Choise ");

			}
			break;
		case 2:
			System.out.println("1.Volume of a Cuboid\n 2.Volume of Cube\n 3.Volume of Cone\n 4.Volume of Cylinder\n Enter Your Choise");
			int opp2=ot.nextInt();
			switch(opp2)
			{
			case 1:
				System.out.println("Enter the lenght of Cuboid");
				int cu1=ot.nextInt();
				System.out.println("Enter the Breadth of Cuboid");
				int cu2=ot.nextInt();
				System.out.println("Enter the Height of Cuboid");
				int cu3=ot.nextInt();
				System.out.println("Volume of Cuboid is: "+(cu1*cu2*cu3));
				break;
			case 2:
				System.out.println("Enter the side of Cube");
				int sel=ot.nextInt();
				System.out.println("Volume of cube is: "+(sel*sel));//pie*(radius*radius)*height/3
				break;
			case 3:
				System.out.println("Enter the Height of Cone");
				int gt1=ot.nextInt();
				System.out.println("Enter the Radius of Cone");
				int gt2=ot.nextInt();
				float pie=3.142f;  
				System.out.println("Volume of Cone is: "+(pie*(gt2*gt2)*gt1/3));
				break;
			case 4:
				System.out.println("Enter the Radius of Cylinder");
				int cr=ot.nextInt();
				System.out.println("Enter the Height of Cyclinder");
				int cr1=ot.nextInt();
				float pie1=3.142f;
				System.out.println("Volume of Cylinder  is: "+(pie1*(cr*cr)*cr1));
				break;
			default:
				System.out.println("Invalid Choise ");

			}
			break;
		default:
		System.out.println("Invalid choise");
		}

	}
}