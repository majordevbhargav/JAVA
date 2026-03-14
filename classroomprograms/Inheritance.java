class Calculator{


    public static void main(String[] args) {
        Calculator c=new Calculator();

        c.Sum();

    }
    void Sum(){
        System.out.println("Hi I am  Sum ");
        this.Sum(5);//use to call current class method
    }
    void Sum(int x){
        System.out.println("Hi i am one arg sum");
    }
    void  Sum(float x){
        System.out.println("Hi i am copy one arg sum");

    }
}