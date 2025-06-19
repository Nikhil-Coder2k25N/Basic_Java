import java.util.Scanner;
public class Fibonacci{
public static void main(String args[]){
int num,second;
System.out.println("Welcome to Nikhil's program");
System.out.print("Fibonacci Series");
System.out.print("Enter Your Number:");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
System.out.print("These is Your Series:");
fibonacciDefinition(num);
	}
public static void fibonacciDefinition(int num){
		if (num<0) return ;
		System.out.print("0 ");
		 if(num==0) return;
		System.out.print("1 ");
		
		int first=0,second=1;
		while(first + second<=num){
			int third=first+second;
			System.out.print(third+ " ");	
			first = second;
			second = third; 
		}
	}
}