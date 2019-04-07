/**
 * Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
 */

package com.sample.sort;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 36, 19, 26, 12, 5 };

		performSort(arr);
		printValues(arr);

	}

	private static void performSort(int arr[]) 
	{

		int temp, j;
		for (int i = 1; i < arr.length; i++) 
		{
			temp = arr[i];
			j = i;
			
			while (j > 0 && arr[j - 1] > temp) 
			{
				arr[j] = arr[j - 1];
				j = j - 1;

			}
			arr[j] = temp;
		}
	}

	private static void printValues(int arr[]) 
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
