package arraypractice;
import java.util.Scanner;
public class Revvalues {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=0;
		int nums[]=new int[n];
		for(int i=n-1;i>=0;i--) {
			nums[k++]=arr[i];
		}
		for(int k1:arr) {
			System.out.print(k1+" ");
		}
		System.out.println();
		for(int k1:nums) {
			System.out.print(k1+" ");
		}
		
		
	}
}
