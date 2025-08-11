package jumpstatement;
import java.util.Scanner;
public class Continuestatement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		int i=1;
		for(i=1;i<10;i++) {
			if(i==n) {
				System.out.println("Skipping the element:"+i+"move to the next");
				continue;
			}
		
		System.out.print(i+" ");
		
	}

	}
}

