package com.sample.misc;

import java.util.HashMap;
import java.util.Map;

public class OddElementInArray {
	public static void main(String args[]) {
		int[] inputArray = { 1, 4, 6, 6, 6, 4, 1 };
		OddElementInArray oddElementInArray = new OddElementInArray();
		int firstKey = 0;
		if (inputArray != null && inputArray.length > 0) {
			firstKey = oddElementInArray.getOddElement(inputArray).keySet().iterator().next();
		}

		System.out.println("Odd element occurence " + firstKey);
	}

	private Map<Integer, Integer> getOddElement(int arr[]) {

		Map<Integer, Integer> oddElementMap = new HashMap<>();
		for (int element : arr) {
			if (oddElementMap.containsKey(element)) {
				oddElementMap.remove(element);
			} else {
				oddElementMap.put(element, 1);
			}

		}
		return oddElementMap;

	}

}