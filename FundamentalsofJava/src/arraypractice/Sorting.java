package arraypractice;
import java.util.Arrays;
import java.util.Scanner;
public class Sorting {
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
		System.out.println("Before Sorting:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		Arrays.sort(arr);
		System.out.println();
		System.out.println("After sorting:");
		for(int i:arr) {
			System.out.print(i+" ");
			
		}
}
}
