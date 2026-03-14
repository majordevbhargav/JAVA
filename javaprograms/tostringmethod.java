/**
 * tostringmethod
 */
public class tostringmethod {
    int a=5,b=5;
    String s="Dev bhargav";
        public static void main(String[] args) {
            tostringmethod t=new tostringmethod();
            System.out.println(t);
    
        }
        @Override
        public String toString() {
            return "tostringmethod [a=" + a + ", b=" + b + ", s=" + s + "]";
        }
      
    
    }
