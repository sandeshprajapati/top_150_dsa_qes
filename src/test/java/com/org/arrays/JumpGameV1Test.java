package com.org.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JumpGameV1Test {

	JumpGameV1 v1 = new JumpGameV1();

	@Test
	void test() {
		int[] nums = { 2, 3, 1, 1, 4 };
		boolean actual = v1.canJump(nums);
		assertEquals(true, actual);
	}

}
