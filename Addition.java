import java.util.Scanner;
public class Addition{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float a,b,n;
        System.out.println("Please Enter 2 Number:");
        a=sc.nextFloat();
        b=sc.nextFloat();
        n=a+b;
        System.out.println("Addtion of 2 Number is:" + n);
    }
}