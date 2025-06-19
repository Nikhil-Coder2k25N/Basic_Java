import java.util.Scanner;
public class Grade{
	public static void main(String args[]){
	int Percentage;
	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome to the Grade Calculator");
			
	System.out.print("Enter the Candidate Percentage:");
	Percentage=sc.nextInt();
	if(Percentage>=90){
	System.out.println(Percentage + "% " + "[Grade:A]");
		}
	else if(Percentage>=75){
	System.out.println(Percentage + "% " + "[Grade:B]");
		}
	else if(Percentage>=60){
	System.out.println(Percentage + "% " + "[Grade:C]");
		}
	else if(Percentage>=30){
	System.out.println(Percentage + "% " + "[Grade:D]");
		}
	else {
	System.out.println(Percentage + "% " + "[Grade:F]");
		}
	}
}