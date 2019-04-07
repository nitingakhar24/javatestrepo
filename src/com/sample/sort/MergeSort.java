package com.sample.sort;

/* Java program for Merge Sort */
public class MergeSort 
{

	private int[] array;
	private int[] tempMergeArray;
	private int length;

	private void sort(int[] inputArray) 
	{
		this.array = inputArray;
		this.length = inputArray.length;
		this.tempMergeArray = new int[length];
		divideArray(0, length - 1);

	}

	private void divideArray(int lowerIndex, int higherIndex) 
	{
		if (lowerIndex < higherIndex) 
		{
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// it will sort the left side of array
			divideArray(lowerIndex, middle);
			// it will sort the right side of array
			divideArray(middle + 1, higherIndex);
			mergeArray(lowerIndex, middle, higherIndex);
		}

	}

	private void mergeArray(int lowerIndex, int middle, int higherIndex) 
	{
		for (int i = lowerIndex; i <= higherIndex; i++) 
		{
			tempMergeArray[i] = array[i];
		}

		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;

		while (i <= middle && j <= higherIndex) 
		{
			if (tempMergeArray[i] <= tempMergeArray[j]) 
			{
				array[k] = tempMergeArray[i];
				i++;
			} else 
			{
				array[k] = tempMergeArray[j];
				j++;
			}
			k++;
		}
		while (i <= middle) 
		{
			array[k] = tempMergeArray[i];
			k++;
			i++;
		}
	}

	/* A utility function to print array of size n */
	private static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print(" ");
	}

	// Main method
	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);

		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(arr);

		System.out.println("\nSorted array");
		printArray(arr);
	}
}
