package com.org.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RandomizedSetTest {

	RandomizedSet randomizedSet = new RandomizedSet();

	@Test
	void test() {
		boolean insert = randomizedSet.insert(5);
		randomizedSet.insert(7);
		randomizedSet.insert(9);
		randomizedSet.insert(1);

		randomizedSet.remove(9);
		for (int i = 0; i < 20; i++) {
			int random = randomizedSet.getRandom();
			System.out.println("index " + i + " random ::" + random);
		}

		assertEquals(true, insert);
	}

}
