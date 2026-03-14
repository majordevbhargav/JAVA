
import java.util.Scanner;
class agerestricionexception extends Exception{
    agerestricionexception(String str){
       super(str);
    }

}


public class Throw {

    public static void main (String args [])throws agerestricionexception{

        Scanner sc=new Scanner(System.in);
      
        System.out.println("enter the age=  ");
        int age=sc.nextInt();
        
        if(age>=18)
        System.out.println(" you are eligible");
        else
        throw  new agerestricionexception("you are not eligible");
        sc.close();
        
    }
    
}
