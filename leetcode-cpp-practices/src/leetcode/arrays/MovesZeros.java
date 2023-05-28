package leetcode.arrays;

import java.util.Arrays;

public class MovesZeros {

	public static void Zeroes(int arr[]) {
		int nz = 0;
		int z = 0;
		if (arr.length == 0 || arr.length == 1) {
			return;
		}
		while (nz < arr.length) {

			if (arr[nz] != 0) {
				int temp = arr[nz];
				arr[nz] = arr[z];
				arr[z] = temp;
				nz++;
				z++;
			} else {
				nz++;
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,0,5,8,0,0,0,2};
		Zeroes(arr);	
		System.out.println(Arrays.toString(arr));				
		}

}
