import java.util.Scanner;
public class IntegerSum{
	public static void main(String args[]){
	int num,sum;
	System.out.println("Welcome to Nikhil Scammer");
	System.out.println("Enter a Number:");
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	sum=integerSumDigit(num);
	System.out.println("Sum of Integer Digit"+ num + "=" + sum );
	}
	public static int integerSumDigit(int num){
	int sum=0;
	while(num>0){
		sum=sum+(num%10);
		num=num/10;			
	}
	return sum;	
	}
}