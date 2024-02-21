package com.org.arrays;

import java.util.Arrays;

public class MergeSortedArrayV1 {

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;

		merge(nums1, m, nums2, n);

	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int i = 0;
		int j = 0;
		int k = 0;
		int[] nums = new int[m + n];

		while (i < m && j < n) {
			if (nums1[i] <= nums2[j]) {
				nums[k] = nums1[i];
				i++;
				k++;
			} else {
				nums[k] = nums2[j];
				j++;
				k++;
			}
		}

		while (i < m) {
			nums[k] = nums1[i];
			i++;
			k++;
		}

		while (j < n) {
			nums[k] = nums2[j];
			j++;
			k++;
		}

		System.out.println(Arrays.toString(nums));
	}

}
