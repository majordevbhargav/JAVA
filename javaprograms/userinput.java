import java.util.Scanner;


public class userinput {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a, b, t ;
        System.out.println("enter first value ");
        a= sc.nextInt();
        System.out.println("enter second number ");
        b= sc.nextInt();
        System.out.println(" before swapping a= "+a  + " b="+b);
        t=a;
        a=b;
        b=t;


        System.out.println(" after swapping a="+a + " b="+b);
    }

    
}