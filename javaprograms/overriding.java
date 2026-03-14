class Vehicle{
    public void running(){  
        
    System.out.println("vehicle is running ");
    }
}
class Car extends Vehicle {
    public void running(){
        System.out.println("car is running ");
    }

}
class Bike extends Vehicle{
    public void running(){
        System.out.println(" bike is running ");
    }

}
/**
 * overriding
 */
public class overriding {

    public static void main(String[] args) {
        Vehicle  V =new Vehicle();
        Car C =new Car();
        Bike B = new Bike();
        V.running();
        C.running();
        B.running();


    }
}