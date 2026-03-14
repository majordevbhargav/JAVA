import java.util.*;
public class ControlStructure {
    public static void main(String[] args) {
        System.out.println("Enter no of rows and Columns ");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=cols;j++){
              if (i==1||i==rows||j==1||j==cols){
                  System.out.print("*");
              }
              else {
                  System.out.print(" ");
              }
            }
            System.out.println();
        }
    }
}
