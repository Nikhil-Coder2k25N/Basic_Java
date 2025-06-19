import java.util.Scanner;
public class AgeCategorize{
	public static void main(String args[]){
	int Age;
	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome to the Check Age Categorie");
	
	System.out.print("Enter the Age of a Person:");
	Age=sc.nextInt();
	if(Age<=13){
	System.out.println(Age +"[Child]");
		}		
	else if(Age<=20){
	System.out.println(Age +"[Teen]");
		}
	else if(Age<=60){
	System.out.println(Age +"[Adult]");
		}
	else{
	System.out.println(Age +"[Senior]");
		}
	}
}