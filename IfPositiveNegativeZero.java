import java.util.Scanner;
public class IfPositiveNegativeZero {
    public static void main(String args[]){
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number to Check:");
        number =sc.nextInt();
	    
        if(number>0){
		System.out.println("It is a Positive Number");
	    }
		else if(number<0){
		System.out.println("It is a Negative Number");
	    }
		else{
		System.out.println("It is a Zero");
	    }
        
    }
}
