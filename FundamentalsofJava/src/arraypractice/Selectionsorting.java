package arraypractice;
public class Selectionsorting {
	public static void main(String[] args) {
		int arr[]= {4,7,3,1,5,2};
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<n;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex=j;
				}
			}
			if(minIndex!=i) {
				int temp=arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex]=temp;
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
