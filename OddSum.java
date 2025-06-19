import java.util.Scanner;
public class OddSum{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome to Nikhil Koders");
	System.out.print("Please Enter Your Number: ");
	int num,sum;
	num=sc.nextInt();
	sum=OddSum(num);
	System.out.println("Your All odd "+ num+ "Sum is:"+ sum);
	}
	public static int OddSum(int num){
		int sum=0,i=1;
		while(i<=num){
		sum+=i;
		i+=2;
		}
		return sum;
	}
}