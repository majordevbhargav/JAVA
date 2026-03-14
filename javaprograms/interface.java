//interface means 100% abstraction 
interface vehicle {
    public void sound();
     public void vehicle();
    

}
class car implements vehicle{
    public void sound(){
        System.out.println("hi  i am the implementation of sound");
    }
    public void vehicle(){
        System.out.println("it is the implementation ");
    }
}
class test {
    public static void main (String args []){
        car c=new car();
        c.sound();
        c.vehicle();

    }
}