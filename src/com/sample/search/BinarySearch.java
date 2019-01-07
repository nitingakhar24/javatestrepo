package com.sample.search;

public class BinarySearch {

	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		int arr[] = { 2, 4, 6, 7, 9, 12, 34, 55, 79 };
		int arrayLength = arr.length;
		int element = 12;
		int index = binarySearch.performSearch(arr, arrayLength, element);
		if (index == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element " + element + " found at " + index + " position");
		}
	}

	private int performSearch(int arr[], int arrayLength, int element) {
		int left = 0, right = arrayLength - 1;
		while (left <= right) {
			int middle = left + (right - left) / 2;
			if (arr[middle] == element)
				return middle;
			if (arr[middle] < element) {
				left = middle + 1;
			} else {
				right = middle - 1;
			}
		}
		return -1;
	}

}
