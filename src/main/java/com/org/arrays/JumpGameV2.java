package com.org.arrays;

public class JumpGameV2 {

	/*
	 * You are given a 0-indexed array of integers nums of length n. You are
	 * initially positioned at nums[0].
	 * 
	 * Each element nums[i] represents the maximum length of a forward jump from
	 * index i. In other words, if you are at nums[i], you can jump to any nums[i +
	 * j] where:
	 * 
	 * 0 <= j <= nums[i] and i + j < n Return the minimum number of jumps to reach
	 * nums[n - 1]. The test cases are generated such that you can reach nums[n -
	 * 1].
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [2,3,1,1,4] Output: 2 Explanation: The minimum number of jumps
	 * to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to
	 * the last index.
	 */

	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 1, 4 };
		JumpGameV2 v1 = new JumpGameV2();
		System.out.println(v1.jump(nums));
	}

	public int jump(int[] nums) {
		int n = nums.length;
		int jump = 0;
		int maxJump = 0;
		int lastEnd = 0;

		for (int i = 0; i < n - 1; i++) {

			maxJump = Math.max(maxJump, i + nums[i]);
			if (i == lastEnd) {
				jump++;
				lastEnd = maxJump;
			}

		}
		return jump;
	}
}
