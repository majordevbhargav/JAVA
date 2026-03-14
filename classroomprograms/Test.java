//class is a logical entity 
//class is a datatype on its own ,user defined datatype ,logical entity .

class Student
{
    //constructor
    // return object of the current class (implicitly)
    Student(){
        System.out.println("object created");
    }

    int rollno,marks;// primitive data type
    void study()
    {
        System.out.println("yes i am studying ");

    }
    void bunk(Student s1){
        System.out.println("i am bunking the class");

    }
}
class Test {
    //Student s1;// non primitive or user defined data type
    int a;

    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student();
        s2.bunk(s2);
        s1.study();
    }
}