package com.sample.sort;

public class SelectionSort 
{
	public static void main(String[] args) 
	{
		int arr[] = {36, 19, 26, 12, 5 };
		int temp = 0;

		performSort(arr, temp);
		printValues(arr);

	}

	private static void performSort(int arr[], int temp) 
	{
		int min;
		for (int i = 0; i < arr.length; i++) 
		{
			min = i;
			for (int j = i + 1; j < arr.length; j++) 
			{
				if (arr[j] < arr[min]) 
				{
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;

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
