package com.org.arrays;

public class GasStationV1 {

	/*
	 * There are n gas stations along a circular route, where the amount of gas at
	 * the ith station is gas[i].
	 * 
	 * You have a car with an unlimited gas tank and it costs cost[i] of gas to
	 * travel from the ith station to its next (i + 1)th station. You begin the
	 * journey with an empty tank at one of the gas stations.
	 * 
	 * Given two integer arrays gas and cost, return the starting gas station's
	 * index if you can travel around the circuit once in the clockwise direction,
	 * otherwise return -1. If there exists a solution, it is guaranteed to be
	 * unique
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2] Output: 3
	 */

	public static void main(String[] args) {

		int[] gas = { 2, 3, 4 };
		int[] cost = { 3, 4, 3 };
		System.out.println(canCompleteCircuit(gas, cost));

	}

	public static int canCompleteCircuit(int[] gas, int[] cost) {

		int n = gas.length;

		int total = 0;

		for (int i = 0; i < n; ++i) {
			total += gas[i] - cost[i];
		}

		if (total < 0) {
			return -1;
		}

		int start = 0, tank = 0;
		for (int i = 0; i < n; ++i) {
			tank += gas[i] - cost[i];
			if (tank < 0) {
				start = i + 1;
				tank = 0;
			}
		}
		return start;
	}

}
