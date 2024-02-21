package com.org.arrays;

import java.util.Arrays;

public class ProductofArrayExceptSelfV3 {
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

		int temp = 1;
		for (int i = 0; i < n; i++) {
			product[i] = temp;

		}
		for (int i = 0; i < n; i++) {
			product[i] = temp;
			temp = temp * nums[i];
		}

		temp = 1;
		for (int i = n - 1; i >= 0; i--) {
			product[i] = product[i] * temp;
			temp = temp * nums[i];
		}

		return product;

	}

}
