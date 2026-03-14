/*
 * Write a program to create an abstract class  with non abstract and  constructor
 * 
 */
abstract class school{
    int data;
    abstract void student();
     school() {
        data=8;
        System.out.println("marks ="+data);

    }
    public void name(){
        System.out.println("Dev Bhargav ");
    }
}
class children extends school{
    void student(){
        System.out.println("the total number of students in the school is 1000 ");
    }
    children(){
        super();
    }
}
/**
 * practice
 */
public class practice {

    public static void main(String[] args) {
        children c=new children();
        c.name();
        c.student();

    }
}
