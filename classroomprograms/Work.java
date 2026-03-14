class Employee{
    int eid;
    int salary;

Employee(){

}
Employee(int eid,int salary){
    //this is use for constructor call
    //is use for local and global variable call
    //also use for current class object
   this.eid=eid;
   this.salary=salary;

}


    void display(){
        System.out.println(eid+" "+salary);

    }
}
public class Work {
    public static void main(String[] args) {
        Employee e=new Employee();
        Employee p=new Employee(101,2000);




        e.display();
        p.display();


    }
}
