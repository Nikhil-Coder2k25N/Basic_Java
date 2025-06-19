import java.util.Scanner;
public class EvenOdd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome To Even & Odd Number Program");
        System.out.print("Enter A Number that You Want to Check:");
        int number;
        number =sc.nextInt();
        if(number%2==0){
            System.out.println("It is a Even Number");
        }
        else{
            System.out.println("Is is a Odd Number");
        }
    }
}
