public class demo{
    public static void main(String[] args) {
        int a=6,b=0,c=0;
        System.out.println("code starts here");
        
        try{
        c=a/b;}
        catch(ArithmeticException e){
         System.out.println("exception caught"+e.getMessage());
        }
        System.out.println("code ends here ");
        System.err.println("hi");
    }
}