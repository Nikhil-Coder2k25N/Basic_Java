public class Parameter{
	public static void main(String args[]){
	System.out.println("Welcome to Nikhil Koders");
	int n=sumTwoNumbers(12,56);
	System.out.println("Result:"+ n);	
	}
	public static int sumTwoNumbers(int a, int b) {
	System.out.println("First Number is Received:"+ a);
	System.out.println("Second Number is Received:"+ b);
	int sum=a+b;
	return sum;	
	}
}