package arraypractice;
import java.util.Scanner;
public class Evennumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=sc.nextInt();
		int sum=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element:"+(i+1));
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
			System.out.println(arr[i]+" ");
		}
}
}
}
