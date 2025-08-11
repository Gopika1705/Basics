package arraypractice;
import java.util.Scanner;
public class Rotatethearray {
	public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of array:");
			int n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter the array elements:");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter the no of rotations:");
			int rotate=sc.nextInt();
			while(rotate>0) {
				int temp=arr[0];
				for(int i=1;i<n;i++) {
					arr[i-1]=arr[i];
				}
				arr[n-1]=temp;
				rotate--;
			}
			for(int i:arr) {
				System.out.print(i+" ");
			}
		}
}
