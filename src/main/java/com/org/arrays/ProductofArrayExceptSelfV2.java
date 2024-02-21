package com.org.arrays;

import java.util.Arrays;

public class ProductofArrayExceptSelfV2 {
	/*
	 * Given an integer array nums, return an array answer such that answer[i] is
	 * equal to the product of all the elements of nums except nums[i].
	 * 
	 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
	 * integer.
	 * 
	 * You must write an algorithm that runs in O(n) time and without using the
	 * division operation.
	 * 
	 * Input: nums = [1,2,3,4] Output: [24,12,8,6] Input: nums = [-1,1,0,-3,3]
	 * Output: [0,0,9,0,0]
	 */

	public static void main(String[] args) {
		int[] nums = { -1, 1, 0, -3, 3 };
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(productExceptSelf(nums)));
	}

	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;

		int[] product = new int[n];

		for (int i = 0; i < n; i++) {
			int temp = 1;

			for (int j = 0; j < n; j++) {
				if (i != j) {
					temp *= nums[j];
				}
			}
			product[i] = temp;
		}
		return product;

	}

}
