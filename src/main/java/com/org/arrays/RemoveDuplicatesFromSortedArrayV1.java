package com.org.arrays;

public class RemoveDuplicatesFromSortedArrayV1 {

	/* remove duplicate element */
	// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

		System.out.println(removeDuplicates(nums));

	}

	public static int removeDuplicates(int[] nums) {
		int i = 0;
		int j = 1;
		int n = nums.length;

		while (j < n) {
			if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
			j++;
		}

		return i + 1;

	}
}
