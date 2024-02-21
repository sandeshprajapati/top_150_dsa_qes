package com.org.arrays;

public class RemoveDuplicatesFromSortedArrayV2 {

	/* remove duplicate element */
	// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 2, 3 };

		System.out.println(removeDuplicates(nums));

	}

	public static int removeDuplicates(int[] nums) {
		int i = 0;
		int j = 0;
		int n = nums.length;

		while (j < n) {
			if (i == 0 || i == 1 || nums[i - 2] != nums[j]) {
				nums[i] = nums[j];
				i++;
			}
			j++;
		}

		return i;

	}
}
