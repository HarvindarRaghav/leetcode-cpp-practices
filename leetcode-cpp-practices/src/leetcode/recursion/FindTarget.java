package leetcode.recursion;

public class FindTarget {

	static int binarysearch(int arr[], int target, int s, int e) {
		if (s > e) {
			return -1;
		}
		int m = s + (e - s)/ 2;
		
		if(target==arr[m]) {
			return m;
		}
		
		if(target<arr[m]) {
			return binarysearch(arr,target,s,m-1);
		}else {
			return binarysearch(arr, target,m+1, e);
		}

	}

	public static void main(String[] args) {
		int arr[]= {0,4,8,10,22,99};
		int target=0;
		System.out.println(binarysearch(arr,target,0,arr.length-1));

	}

}
