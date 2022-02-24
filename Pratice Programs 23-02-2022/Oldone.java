import java.util.Scanner;

class Oldone
{
	public static void main(String args[])
	{
		Scanner fa= new Scanner(System.in);
		System.out.println("User-1, Please enter Your name");
		String name1 = fa.next();
		System.out.println(name1+" enter your age");
		int age1 = fa.nextInt();
		System.out.println("User-2, Please enter Your name");
		String name2 = fa.next();
		System.out.println(name2+" enter your age");
		int age2 = fa.nextInt();
		System.out.println("User-3, Please enter Your name");
		String name3= fa.next();
		System.out.println(name3+" enter your age");
		int age3 = fa.nextInt();
		if(age1>age2)
		{
			if(age1>age3)
			{
				System.out.println(name1+" is Greatest among "+name2+ name3 );
			}
			else
			{
				System.out.println(name3+" is Greatest among "+name1+ name2 );
			}
		}
		else
		{
			if(age3>age2)
			{
				System.out.println(name3+" is Greatest among "+name1+ name2 );
			}
			else
			{
				System.out.println(name2+" is Greatest among "+name1+ name3 );
			}


		}

	}
}