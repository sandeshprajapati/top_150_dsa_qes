package com.org.arrays;

import java.util.*;

public class RandomizedSet {

	List<Integer> list;
	Map<Integer, Integer> map;
	Random random = new Random();

	public RandomizedSet() {
		list = new ArrayList<>();
		map = new HashMap<>();

	}

	public boolean insert(int val) {
		if (map.containsKey(val)) {
			return false;
		}
		map.put(val, list.size());
		list.add(val);
		return true;

	}

	public boolean remove(int val) {
		if (!map.containsKey(val)) {
			return false;
		}

		int indexToRemove = map.get(val);
		int lastEle = list.get(list.size() - 1);

		/* SWAP element */
		list.set(indexToRemove, lastEle);
		map.put(lastEle, indexToRemove);

		list.remove(list.size() - 1);
		map.remove(val);

		return true;

	}

	public int getRandom() {
		return list.get(random.nextInt(list.size()));
	}

}
