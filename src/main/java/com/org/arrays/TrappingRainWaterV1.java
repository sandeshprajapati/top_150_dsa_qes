package com.org.arrays;

public class TrappingRainWaterV1 {

	public static void main(String[] args) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		TrappingRainWaterV1 v1 = new TrappingRainWaterV1();
		System.out.println(v1.trap(height));

	}

	public int trap(int[] height) {

		int maxWater = 0;
		int n = height.length;

		int[] left = new int[n];
		int[] right = new int[n];

		left[0] = height[0];
		right[n - 1] = height[n - 1];
		for (int i = 1; i < n; i++) {
			left[i] = Math.max(left[i - 1], height[i]);
		}
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], height[i]);
		}

		for (int i = 0; i < n; i++) {
			maxWater += Math.min(left[i], right[i]) - height[i];
		}
		return maxWater;

	}

}
