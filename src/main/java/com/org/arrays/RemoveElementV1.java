package com.org.arrays;

public class RemoveElementV1 {

	public static void main(String[] args) {

		int[] nums = { 3, 2, 2, 3 };
		int val = 3;

		System.out.println(removeElement(nums, val));

	}

	public static int removeElement(int[] nums, int val) {
		int i = 0;
		int j = 0;
		int n = nums.length;

		while (i < n) {
			if (nums[i] != val) {
				nums[j] = nums[i];
				j++;
			}
			i++;
		}

		return j;

	}
}
