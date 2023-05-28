package leetcode.arrays;

import java.util.Arrays;

public class SortEvenOdd {
	
	public static int[] evenodd(int arr[]) {
		int even=0;
		int odd=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[even]%2==0) {
				int temp = arr[even];//using the temp variable for swapping even odd numbers
				arr[even]=arr[odd];
				arr[odd]=temp;
				even++;
				odd++;
			}else {
				even++;
			}
			
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,7,8,3,0,5};
		evenodd(arr);
		System.out.println(Arrays.toString(arr));
	}

}
