import java.util.Scanner;

public class Factorial {
  public static void main(String args[]) {
    int num;
    System.out.print("Enter a number:");
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    long result = FactorialDefination(num);
    System.out.println("FACTORIAL OF " + num + " IS:" + result);
  }

  public static long FactorialDefination(int num) {
    if (num == 0 || num == 1) {
      return 1;
    }
    long result = 1;
    int i = 2;
    while (i<=num) {
      result *= i;
      i++;
    }
    return result;
  }
}
