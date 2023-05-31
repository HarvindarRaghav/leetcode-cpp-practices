package leetcode.arrays;

public class ThirdMaximum {
	public static int thirdmax(int arr[]) {
		Integer first=null;
		Integer second=null;
		Integer third=null;
		for(int i=0;i<arr.length;i++) {
			if(first==null || arr[i]>first) {
				third=second;
				second=first;
				first=arr[i];
			}else if(second==null || arr[i]>second) {
				third=second;
				second=arr[i];
			}else if(third==null || arr[i]>third) {
				third=arr[i];
			}
		}
 return third;
	}

	public static void main(String[] args) {
		
   int arr[]= {9,10,6,8,2};
   thirdmax(arr);
   System.out.println(thirdmax(arr));
   
	}

}
