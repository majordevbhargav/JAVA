import java.util.Scanner;
/**
 * exception
 */
public class exception {

    public static void main(String[] args) {
        int ar[]=new int[5];
        System.out.println("program starts here");
        System.out.println("enter first value ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter second value" );
        int b=sc.nextInt();
        try{
            System.out.println(ar[7]);
        int c=a/b;
        System.out.println("result= " +c);
        }
        catch(ArrayIndexOutOfBoundsException ai){
            ai.printStackTrace();
            
        }
       catch(Exception ae){
        System.out.println("Hi exception is caught");
        ae.printStackTrace();
        
    }

        System.out.println("program executed sucessfully ");
    }
}