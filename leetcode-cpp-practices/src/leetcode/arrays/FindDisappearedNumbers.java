package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {

	public static List<Integer> findDisappered(int nums[]) {

		List<Integer> list = new ArrayList<>();
// this loop is for the itration over the array and mark them visited via finding the index and make them negative via -1 multiply
		for (int i = 0; i < nums.length; i++) {

			int idx = Math.abs(nums[i]) - 1;

			if (nums[idx] < 0) {
				continue;
			}

			nums[idx] *= -1;

		}
// this loop is to find those index which are not negative and not visited in above loop
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > 0) {
				list.add(i + 1);
			}
		}
		System.out.println(list);
		return list;
	}

	public static void main(String[] args) {
		int nums[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
		findDisappered(nums);
	}

}
