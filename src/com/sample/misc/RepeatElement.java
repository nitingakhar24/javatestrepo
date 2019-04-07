package com.sample.misc;

import java.util.HashMap;
import java.util.Map;

class RepeatElement {
	void printRepeating(int arr[], int size) {
		Map<Integer, Integer> countMap = new HashMap<>();
		for (int i = 0; i < size; i++) {

			if (countMap.containsKey(arr[i])) {
				countMap.put(arr[i], countMap.get(arr[i]) + 1);
			} else {
				countMap.put(arr[i], 1);
			}
		}

		System.out.println("Characters count " + countMap);

	}

	public static void main(String[] args) {
		RepeatElement repeat = new RepeatElement();
		int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
		int arr_size = arr.length;
		repeat.printRepeating(arr, arr_size);
	}
}
