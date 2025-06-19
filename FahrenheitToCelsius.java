import java.util.Scanner;
public class FahrenheitToCelsius{
public static void main(String[] args) {
float Celsius,Fahrenheit;
Scanner sc=new Scanner(System.in);
System.out.println("Welcome of Temperature Converter");
System.out.print("Enter Your Temperature in Fahrenheit °F:");
Fahrenheit =sc.nextFloat();

Celsius=(Fahrenheit-32)*5/9;
System.out.println("Temperature in Celsius Is: " + Celsius + " °C");    
    }
}
