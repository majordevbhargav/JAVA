// this is an example of multi level inheritance 
class B{
    int data=8;
    public void m1(){
        System.out.println("Hi I am from the class B");
        System.out.println("Data="+data);
    }
}
class D1 extends B{
   
    public void m2(){
        System.out.println("Hi i am from the class D1");
        
}
}
class D2 extends D1{
    public void m3(){
        System.out.println("Hi i am from the D2");

    }

}
/**
 * multilevelinheritance
 */
public class multilevelinheritance {

    public static void main(String args[]){
        D2 d = new D2();
        D1 b= new D1();
        d.m1();
        b.m1();
        d.m3();
        b.m2();
        
    }
}
