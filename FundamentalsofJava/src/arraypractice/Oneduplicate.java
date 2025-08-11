package arraypractice;
import java.util.Arrays;
import java.util.Scanner;
public class Oneduplicate {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);	
		for(int i: arr) {
			System.out.print(i+" ");
		}
		int i=1;
		System.out.println();
		while(i<n) {
			System.out.print(arr[i]+" ");
		    while(i+1<arr.length && arr[i]==arr[i+1]) {
				i++;
			}
			i++;
		}
		sc.close();	
		}
	}

