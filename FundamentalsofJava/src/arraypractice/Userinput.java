package arraypractice;
import java.util.Scanner;
public class Userinput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int n=sc.nextInt();
		int sum=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element:"+(i+1));
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		int avg=sum/n;
		for(int i:arr) {
			System.out.println(i+" ");
		}
		System.out.println("Sum:"+sum);
		System.out.println("Avg:"+avg);

}
}
