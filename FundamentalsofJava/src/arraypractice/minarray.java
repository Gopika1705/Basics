package arraypractice;

import java.util.Arrays;

public class minarray {
	public static void main(String[] args) {
		int arr[]= {5,7,15,2,9,7,5};
		int max=arr[0];
		for(int i:arr) {
			if(i>max) {
				max=i;
			}
		}
		System.out.println("Maximum element:"+max);
	}
}
