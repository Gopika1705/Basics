package arraypractice;
import java.util.Arrays;
import java.util.Scanner;
public class Uniqueelements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);		
		if(arr[0]!=arr[1]) {
			System.out.print(arr[0]+" ");
		}
		for(int i=1;i<n-1;i++) {
			if(arr[i-1]!=arr[i] && arr[i+1]!=arr[i]) {
				System.out.print(arr[i]+" ");
			}
		}
		if(arr[n-1]!=arr[n-2]) {
			System.out.print(arr[n-1]);
		}
	}
}
