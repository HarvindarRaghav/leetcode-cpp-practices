package leetcode.arrays;

import java.util.Arrays;

public class Height_Checker {
	public static int[] heightChecker(int[] heights) {
       
        
        for(int i=0;i<heights.length-1;i++){
        	 int count=i;
            if(heights[i]>heights[i+1]){
            	 
                int temp = heights[i];
                heights[i]=heights[i+1];
                heights[i+1]=temp;
               
                ++count;
                System.out.println(count);
            }
        }
       
        return heights;
    }
	public static void main(String[] args) {
		int heights[]= {5,1,2,3,4};
		heightChecker(heights);
		System.out.println(Arrays.toString(heights));
}
}