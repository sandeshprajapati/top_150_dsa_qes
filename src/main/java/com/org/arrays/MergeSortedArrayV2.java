package com.org.arrays;

import java.util.Arrays;

public class MergeSortedArrayV2 {

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;

		merge(nums1, m, nums2, n);

	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;

		while (i >= 0 && j >= 0) {
			if (nums1[i] >= nums2[j]) {

				nums1[k] = nums1[i];
				i--;
				k--;
			} else {
				nums1[k] = nums2[j];
				j--;
				k--;
			}
		}

		while (i >= 0) {
			nums1[k] = nums1[i];
			i--;
			k--;
		}

		while (j >= 0) {
			nums1[k] = nums2[j];
			j--;
			k--;
		}

		System.out.println(Arrays.toString(nums1));
	}

}
// @formatter:off
 



/*Input:
nums1 = [1, 2, 3, 0, 0, 0]
m = 3

nums2 = [2, 5, 6]
n = 3

Step 1: i = m - 1
          = 3 - 1
          = 2

        j = n - 1
          = 3 - 1
          = 2

        k = m + n - 1
          = 3 + 3 - 1
          = 5

Step 2: loop for i >= 0 && j >= 0
        2 >= 0 && 2 >= 0
        true

        if nums1[i] >= nums2[j]
        nums1[2] >= nums2[2]
        3 > 6
        false

        nums1[k] = nums2[j--]
        nums1[5] = 3

        j--
        j = 1

        k--
        k = 4

        nums1 = [1, 2, 3, 0, 0, 6]

Step 3: loop for i >= 0 && j >= 0
        2 >= 0 && 1 >= 0
        true

        if nums1[i] >= nums2[j]
        nums1[2] >= nums2[1]
        3 > 5
        false

        nums1[k] = nums2[j--]
        nums1[4] = 6

        j--
        j = 0

        k--
        k = 3

        nums1 = [1, 2, 3, 0, 5, 6]

Step 4: loop for i >= 0 && j >= 0
        2 >= 0 && 0 >= 0
        true

        if nums1[i] >= nums2[j]
        nums1[2] >= nums2[0]
        3 > 2
        true

        nums1[k] = nums1[i--]
        nums1[3] = 3

        i--
        i = 1

        k--
        k = 2

        nums1 = [1, 2, 3, 3, 5, 6]

Step 5: loop for i >= 0 && j >= 0
        1 >= 0 && 0 >= 0
        true

        if nums1[i] >= nums2[j]
        nums1[1] >= nums2[0]
        2 >= 2
        true

        nums1[k] = nums1[i--]
        nums1[2] = 2

        i--
        i = 0

        k--
        k = 1

        nums1 = [1, 2, 2, 3, 5, 6]

Step 6: loop for i >= 0 && j >= 0
        0 >= 0 && 0 >= 0
        true

        if nums1[i] >= nums2[j]
        nums1[0] >= nums2[0]
        1 >= 2
        false

        nums1[k] = nums2[j--]
        nums1[1] = 2

        j--
        j= -1

        k--
        k = 0

        nums1 = [1, 2, 2, 3, 5, 6]

Step 7: loop for i >= 0 && j >= 0
        0 >= 0 && -1 >= 0
        false

Step 8: for i >= 0
        0 >= 0
        true

        nums1[k--] = nums1[i--]
        nums1[0] = nums1[0]
        nums1[0] = 1

        k--
        k = -1

        i--
        i = -1

Step 9: for j >= 0
        -1 >= 0
        false

So the answer is [1, 2, 2, 3, 5, 6].*/

//@formatter:on