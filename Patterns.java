import java.util.Scanner;
public class Patterns
{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int maxrows;
	System.out.println("Enter the Number of rows");
	maxrows=sc.nextInt();
	FirstPattern(maxrows);		
	SecondPattern(maxrows);
	  		} 

	public static void FirstPattern(int n){
	int i,j;
	for(i=0;i<n;i++){				
			System.out.print("* ");
       			for(j=0;j<i;j++){
					System.out.print("* ");
				} 
					System.out.println(" ");
			}	
		}
	public static void SecondPattern(int n){
	int i,j;
	for(i=n;i>0;i--){
			for(j=0;j<i;j++){
					System.out.print("* ");
				}
					System.out.println(" ");
			}
		
		}
				
	}
