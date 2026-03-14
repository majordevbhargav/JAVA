class B{
    int data=8;
    public void m1(){
    System.out.println("hi I am from the class B");
    System.out.println("Data="+data);    
    }

}
class D1 extends B{
    public void m2(){
        
        System.out.println("Hi i am from the class D1");

    }
}
class D2 extends B{
    public void m3(){
        System.out.println("Hi i am from the class D2");

    }
    }
    /**
     * heriricalinheritance
     */
    public class heriricalinheritance {
    
        public static void main (String []args){
            D1 d1= new D1();
            D2 d2= new D2();
            d1.m1();
            d2.m3();
            d1.m2();
            d2.m1();
          
            
    }
    }