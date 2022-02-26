import java.util.Scanner;

class Rupe
{
	public static void main(String args[])
	{
		Scanner od= new Scanner(System.in);
		System.out.println("Enter The amount");
		int amount=od.nextInt();
		switch(amount)
		{
		default:
			int rem2,ext2;
			rem2=amount/2000;
			ext2= rem2*2000;
			amount=amount-ext2;
			System.out.println("2000 x "+rem2+"="+ext2);
		}
		switch(amount)
		{
		default:
			int rem5,ext5;
			rem5=amount/500;
			ext5=rem5*500;
			amount=amount-ext5;
			System.out.println("500 x "+rem5+"="+ext5);
		}
		switch(amount)
		{
		default:
			int rem100,ext100;
			rem100=amount/100;
			ext100=rem100*100;
			amount=amount-ext100;
			System.out.println("100 x "+rem100+"="+ext100);
		}
		switch(amount)
		{
		default:
			int rem50,ext50;
			rem50=amount/50;
			ext50=rem50*50;
			amount=amount-ext50;
			System.out.println("50 x "+rem50+"="+ext50);
		}
		switch(amount)
		{
		default:
			int rem10,ext10;
			rem10=amount/10;
			ext10=rem10*10;
			amount=amount-ext10;
			System.out.println("10 x "+rem10+"="+ext10);
		}
		switch(amount)
		{
		default:
			int rem05,ext05;
			rem05=amount/5;
			ext05=rem05*5;
			amount=amount-ext05;
			System.out.println("5 x "+rem05+"="+ext05);
		}
		switch(amount)
		{
		default:
			int rem01,ext01;
			rem01=amount/1;
			ext01=rem01*1;
			amount=amount-ext01;
			System.out.println("1 x "+rem01+"="+ext01);
		}
	}
}