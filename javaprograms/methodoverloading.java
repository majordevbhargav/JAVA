class Sum{
	 
	 
    public int sum(int a, int b) {
        return a+b;
    }
    
    public int sum(int a, int b,int c)
    {
        return a+b+c;
    }
    
    public float sum(float a, float b)
    {
        return a+b;
    }
    
    public double sum(double a, double b)
    {
        return a+b;
    } 
    
}

/**
 * methodoverloading
 */
public class methodoverloading   {
    public static void main(String[] args) {
       Sum s=new Sum();
       System.out.println(s.sum(3, 4));
       System.out.println(s.sum(4,5,6));
       System.out.println(s.sum(4.0f, 5.4f));
       System.out.println(s.sum(4.0, 4.0f));
   }
}