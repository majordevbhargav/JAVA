  class Demo {
 
    private static int count =0;
 
    public int countfunction()
    {
       count ++;
       return count;
    }
 
 
    
  }
 public class countobject {
 
    public static void main(String [] args)
    {
       int x;
       Demo d1 = new Demo();
        x = d1.countfunction();
       System.out.println(x);
       Demo d2 = new Demo();
       int y = d2.countfunction();
       System.out.println(y);
       Demo d3 = new Demo();
       int z = d3.countfunction();
       System.out.println(z);
    }
 }
 //public class MyClass {
   // private static int objectCount = 0;
 
   // public MyClass() {
     //   objectCount++;
  //  }
 
    //public static int getObjectCount() {
     //   return objectCount;
    //}
 //}
 
 
