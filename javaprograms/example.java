import java.util.Scanner;
/**
 * example
 */
public class example {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the age ");
        int age =sc.nextInt();
        if(age<18)
        throw new ArithmeticException("you are not eligible");
        else
        System.out.println("you are eligible");
    }
}