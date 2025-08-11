package twodarrays;
public class Twodarray {
	public static void main(String[] args) {
		int arr[][]= {{10,11,12},
				     {13,14,15}
		};
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
}
