package com.org.arrays;

public class JumpGameV1 {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 1, 4 };
		JumpGameV1 v1 = new JumpGameV1();
		System.out.println(v1.canJump(nums));
	}

	public boolean canJump(int[] nums) {

		int n = nums.length;
		int finalPosition = n - 1;

		for (int i = n - 2; i >= 0; i--) {
			if (i + nums[i] >= finalPosition) {
				finalPosition = i;
			}
		}
		return finalPosition == 0;
	}
}
