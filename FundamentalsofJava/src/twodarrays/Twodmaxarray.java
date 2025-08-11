package twodarrays;
public class Twodmaxarray {
	public static void main(String[] args) {
		int arr[][]= {{1,2,30},
				{45,90,60}};
		for(int k=0;k<arr.length;k++) {
			int max=arr[k][0];
			for(int i=1;i<arr.length;i++) {
				if(arr[k][i]>max) {
					max=arr[k][i];
			}
		}
		System.out.println("Maximum element in row:"+k+" is: "+max);
	}
}
}
