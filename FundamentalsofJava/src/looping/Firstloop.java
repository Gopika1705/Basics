package looping;
import java.util.Scanner;
public class Firstloop {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.print("Enter a number n:");
		int n=sc.nextInt();
		System.out.println("Factors of given number is: ");
		for(int i=1;i<n;i++) {
				if(n%i==0){
					count++;
						System.out.print(i+" ");
						
						}
	}
		System.out.println();
		System.out.println("count:"+ count);

}
}
