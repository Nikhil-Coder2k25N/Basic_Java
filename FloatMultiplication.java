import java.util.Scanner;
public class FloatMultiplication {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float first,second;
        System.out.print("Enter the First Number:");
        first=sc.nextFloat();
        System.out.print("Enter the Second Number:");
        second=sc.nextFloat();
        System.out.println("Multiplication of Two Numbers:"+(first*second));

    }
}
