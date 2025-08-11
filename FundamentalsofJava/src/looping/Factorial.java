package looping;
import java.util.Scanner;
public class Factorial {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int fact=1;
		System.out.print("Enter a number n:");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			System.out.println(fact+" * "+i);
			fact=i*fact;
		}
		System.out.println("Factorial of n is "+fact);
	}

}
