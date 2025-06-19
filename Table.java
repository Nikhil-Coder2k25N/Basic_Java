import java.util.Scanner;
public class Table{
public static void main(String args[]){
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Welcome to Nikhil Koders\n");
    System.out.print("Enter a Number that you want to print Multiplication:");
    num=sc.nextInt();
    multiplicationTable(num);

    }
public static void multiplicationTable(int num){
    int i=1;
    while(i<=10){
    System.out.println(num + " X " + i + " = " + (num*i));
    i++;
        }    
    }
}