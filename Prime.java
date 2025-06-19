import java.util.Scanner;
public class Prime{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int num,result;
	System.out.print("Enter a Number that You want to check:");
	num=sc.nextInt();
	Boolean PrimeDefinition=PrimeDefinition(num);
	if(PrimeDefinition){	
		System.out.println("Your Number is Prime Number");
		}else {
			System.out.println("Your Number is Not Prime ");
		}
	}
	public static boolean PrimeDefinition(int num) {
	int i=2;
	
	while(i<num){
		if(num%i==0){
		return false;	
			}
		i++;
		}
	return true;		
	}
}