package com.org.arrays;

public class RotateArrayV2 {

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

		rotateArray(nums, 0, n - k - 1);

		rotateArray(nums, n - k, n - 1);

		rotateArray(nums, 0, n - 1);

	}

	private static void rotateArray(int[] nums, int i, int j) {

		while (i < j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}

	}
}
