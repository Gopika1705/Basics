package twodarrays;
public class Twodcolumn {
	public static void main(String[] args) {
		String arr[][]= {{"ak","abdul"},
				{"eswar","dube"},
				{"mercy","dhivya"}};
		for(int col=0;col<arr[0].length;col++) {
			for(int row=0;row<arr.length;row++) {
				System.out.println(arr[row][col]+" ");
			}
		}
		System.out.println();
				}
	}

