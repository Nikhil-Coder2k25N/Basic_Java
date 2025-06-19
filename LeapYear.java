import java.util.Scanner;
public class LeapYear{
	public static void main(String args[]){
		int Year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to LeapYear Program Calculator");
		System.out.print("Enter the Year that You want to Check:");		Year=sc.nextInt();
		if(Year%4==0){
		System.out.println("Your Year"+Year+"is a Leap Year");
		}	
		else if(Year%400==0){
		System.out.println("Your Year"+Year+"is a Leap Year");
		}
		else if(Year%100==0){
		System.out.println("Your Year"+Year+"is Leap Not a Year");
		}
		else{
		System.out.println("Your Year"+Year+"is Not a Leap Year");
		}
	}
}