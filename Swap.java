import java.util.Scanner;
class Swap{
    public static void main(String args[]){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of A:");
        a=sc.nextInt();
        System.out.print("Enter the value of B:");
        b=sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("The value of A:"+ a);
        System.out.print("The value of B:"+ b);

    }
} 
