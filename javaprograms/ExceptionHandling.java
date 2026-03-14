//Program 3

import java.util.Scanner;

class ExceptionHandling{
	public static void main(String[] args) {
		int x,y,z;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a value");
		x=sc.nextInt();
		System.out.println("Enter a value");
		y=sc.nextInt();
		try {
			String s=args[0];
		z=x/y;
		}
		catch(ArithmeticException |ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae);
			ae.printStackTrace();
		}
		System.out.println("I am  in the last");
	}
}

