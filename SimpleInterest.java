import java.util.Scanner;
public class SimpleInterest {
    public static void main(String args[]){
        int Principal;
        float Interest,Time;
        Scanner sc=new Scanner(System.in);
        System.out.print("Welcome to Simple Interest Calculator\n");
        System.out.print("Enter the Amount of Principal:");
        Principal=sc.nextInt();
        System.out.print("Enter the Rate of Interest In %: ");
        Interest=sc.nextFloat();
        System.out.print("Enter the Time Period Like Years:");
        Time=sc.nextFloat();
        float Result=(Principal*Interest*Time)/100 ;
        System.out.print("Simple Interest Is:"+ "Rs" + Result);
        
    }
}
