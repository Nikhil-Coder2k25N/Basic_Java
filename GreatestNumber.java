import java.util.Scanner;
public class GreatestNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Double a,b,c;

		System.out.println("Welcome to our Program Greatest of the Three Numbers");
		System.out.print("Enter First Number:");
		a=sc.nextDouble();

		System.out.print("Enter Second Number:");
		b=sc.nextDouble();

		System.out.print("Enter Third Number:");
		c=sc.nextDouble();

		if (a >= b && a >= c) {
          	  System.out.println("The greatest number is: " + a);
        	} 
		else if (b >= a && b >= c) {
            	  System.out.println("The greatest number is: " + b);
        	} 
		else {
            	  System.out.println("The greatest number is: " + c);
        	}
    	}
}