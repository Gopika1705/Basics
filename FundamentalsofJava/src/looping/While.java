package looping;
import java.util.Scanner;
public class While {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		int i=1;
		int sum=0;
		int product=1;
		while(i<=n) {
			if(i%2==0) {
				sum+=i;
			}
			else {
				product*=i;
			}
			i++;
		}
		System.out.println("Sum of even no:"+sum+"\nProduct of odd no:"+product);
		sc.close();
	}
}
