package looping;
import java.util.Scanner;
public class Productofdigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		int product=1;
		int zeroCount=0;
		while(n>0) {
			int temp=0;
			if(temp!=0) {
				product*=temp;
			}
			else {
				zeroCount++;
			}
			n=n/10;
		}
		System.out.println("product:"+product);
		System.out.println("No Occurance of Zero:"+zeroCount);
		sc.close();
	}

}
