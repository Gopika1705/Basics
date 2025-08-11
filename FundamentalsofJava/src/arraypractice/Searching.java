package arraypractice;
import java.util.Scanner;
public class Searching {
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
		System.out.println("Enter the search element: ");
		int search=sc.nextInt();
		boolean flag=false;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]==search) {
				flag=true;
			}
		}
		if(flag) {
			System.out.println("Search element found");
		}
		else {
			System.out.println("Not found");
		}
	}
}
