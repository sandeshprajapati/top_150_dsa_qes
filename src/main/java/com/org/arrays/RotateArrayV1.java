package com.org.arrays;

public class RotateArrayV1 {

	/*
	 * Given an integer array nums, rotate the array to the right by k steps, where
	 * k is non-negative.
	 * 
	 * nums = [1,2,3,4,5,6,7], k = 3
	 * 
	 * 1, 2, 3, 4, 5, 6, 7 i =1 => 7, 1, 2, 3, 4, 5, 6
	 * 
	 * i =2 => 6, 7, 1, 2, 3, 4, 5
	 * 
	 * i =3 => 5 ,6, 7, 1, 2, 3, 4
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;

		rotate(nums, k);

	}

	public static void rotate(int[] nums, int k) {

		int n = nums.length;

		k = k % n;
		int[] array = new int[n];
		// copy data in temp array//5,6,7
		for (int i = n - k; i < n; i++) {
			array[i - n + k] = nums[i];
		}
		// sift nums data on end position
		for (int i = n - k - 1; i >= 0; i--) {
			nums[i + k] = nums[i];
		}

		for (int i = 0; i < k; i++) {
			nums[i] = array[i];
		}

	}
}
