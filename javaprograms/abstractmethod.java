abstract class vehicle{
    int data;
     void message(){
        System.out.println("data = "+data);
    }

    abstract void  sound();
     vehicle()
     {
        this.data = 6;
        System.out.println("Hi I am called");
     }



}
class car extends vehicle{
    car()
    {
        super();
    }
    void sound(){
        System.out.println(" car is running");
    }

}
/**
 * abstractmethod
 */
public class abstractmethod {

    public static void main(String[] args) {
        car c= new car();
        c.sound();
        c.message();
    }
}