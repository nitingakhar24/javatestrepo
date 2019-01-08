package com.sample.sort;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int arr[] = { 36, 19, 26, 12, 5 };
		int temp = 0;

		performSort(arr, temp);
		printValues(arr);

	}

	private static void performSort(int arr[], int temp) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			boolean swapflag = false;
			for (int j = 0; j < arr.length - 1 - i; j++) 
			{
				if (arr[j] > arr[j + 1]) 
				{
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapflag = true;
					;
				}
			}
			if (!swapflag) 
			{
				break;
			}
		}
	}

	private static void printValues(int arr[]) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
	}

}
