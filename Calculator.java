import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    double a,b;
    System.out.print("Enter First the Number:");
    a=sc.nextDouble();
    System.out.print("Enter Second Number:");
    b=sc.nextDouble();

    double Add=a+b;
    double Sub=a-b;
    double Mul=a*b;
    double Div=a/b;
    double Mod=a%b;

    System.out.println("Addition:" + Add);
    System.out.println("Subtraction:" + Sub);
    System.out.println("Multiplication:" + Mul);
    System.out.println("Division:" + Div);
    System.out.println("Modulus:" + Mod);
    }
}

