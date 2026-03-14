// it is the program of single inheritance.
//parent class 
class B{
    int data=8;
    public void m1(){
        System.out.println("Hi i am from the class B");
        System.out.println("Data="+data);
    }
}
class D extends B {
    public void m2(){
        System.out.println("Hi i am from the class D");
    }
}
/**
 * inheritance
 */
public class singleinheritance {
public static void main(String[] args) {
    D d = new D();
    d.m1();
    d.m2();
}
    
}