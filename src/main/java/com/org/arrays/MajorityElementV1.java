package com.org.arrays;

public class MajorityElementV1 {

	// Majority Element
	// https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150

	public static void main(String[] args) {

		int[] nums = { 3, 2, 3 };
		System.out.println(majorityElement(nums));

	}

	public static int majorityElement(int[] nums) {

		int candidate = findCandidate(nums);

		if (isMajority(nums, candidate)) {
			return candidate;
		}

		return 0;

	}

	public static boolean isMajority(int[] nums, int candidate) {

		int n = nums.length;
		int me = n / 2;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (nums[i] == candidate) {
				count++;
			}

		}

		if (count > me) {
			return true;
		}

		return false;
	}

	public static int findCandidate(int[] nums) {

		int n = nums.length;
		int count = 0;
		int maj_index = 0;

		for (int i = 0; i < n; i++) {

			if (nums[maj_index] == nums[i]) {
				count++;
			} else {
				count--;
			}

			if (count == 0) {
				maj_index = i;
				count = 1;
			}

		}
		return nums[maj_index];

	}

}
