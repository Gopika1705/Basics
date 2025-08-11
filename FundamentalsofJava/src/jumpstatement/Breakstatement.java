package jumpstatement;
import java.util.Scanner;
public class Breakstatement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		int i=1;
		while(i<10) {
			if(i==n) {
				break;
			}
			System.out.print(i+" ");
			i++;
		}
	}
}