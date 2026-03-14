class xyz{
    //no return type ,same name as of the class ,use to inialise the object ,we dont need to call this 
    //constructor 
    xyz(){
System.out.println("hi");
    }
    void m1(){
        System.out.println("hi i am m1()");
    }
    static{
        System.out.println("hi i am static ");

    }
}
/**
 * classcountprogram
 */
public class classcountprogram {

    public static void main(String[] args) {
        xyz x=new xyz();
        x.m1();
    }
}