/**
 * Dev
 */
import java.util.Scanner;
public class Dev {

	public static void main(String[] args) {
		int x,y,z;
		System.out.println("starting of the program ");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first value ");
		x=sc.nextInt();
		System.out.println("enetr the second value ");
		y=sc.nextInt();
		try {
			String s=args[0];
			z=x/y;
		} catch (ArithmeticException |ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
			ae.printStackTrace();
			
		}
System.out.println("program executed ");

	}
}