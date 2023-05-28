package leetcode.arrays;

import java.util.Arrays;

public class Removeduplicate {
//Remove Duplicates from Sorted Array
	public int removeduplicate(int nums[]) {
		int count=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[count]){
            	count++;
                nums[i]=nums[count];
                
		}
		
		
	} System.out.println(Arrays.toString(nums));
	System.out.println(count);
        return count;
       
	}
	public static void main(String[] args) {
		int nums[]= {1,1,2};
		Removeduplicate Removeduplicate =new Removeduplicate();
		Removeduplicate.removeduplicate(nums);
		
	}

}
