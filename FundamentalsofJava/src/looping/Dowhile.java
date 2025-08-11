package looping;
import java.util.Scanner;
public class Dowhile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		int product=1;
		do {
			if(n%2==0) {
				System.out.println(product+" * "+n);
				product*=n;
			}
			n--;
		}while(n>0);
		System.out.println(product);
		sc.close();
}
}
