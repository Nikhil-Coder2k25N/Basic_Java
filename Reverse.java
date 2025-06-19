import java.util.Scanner;
public class Reverse{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter Your Number:");	
int num=sc.nextInt();
int reverse=reverse(num);
System.out.println("Reverse of Your Number "+ num + " Is:" + reverse);	
		}
public static int reverse(int num){
		int newNum=0;
		while(num>0){
			int digit =num%10;
			newNum=newNum*10+digit;
			num/=10;
		}
		return newNum;
	}
		}