class Demo{
    public int x ;//imstance variables 
    public int y;
    public static int z =30;//static variables
    Demo(){
        int x=4;
        int y=3;
    }
    public int product(){
        int p;
        p=x*y;//local variables 
        return p;
    }
    public void print(){
        System.out.println(x*y);
    }
    

}
/**
 * constructor
 */
public class constructor {

    public static void main(String[] args) {
        Demo d1=new Demo();
        d1.product();
        System.out.println("p=");
        Demo d2=new Demo();
        d2.x=40;
        d2.y=30;
        d2.product();
        System.out.println("p2=");
        System.out.println(Demo.z);

}
}