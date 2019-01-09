package com.sample.sort;


/*Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
Example:
First Pass:
( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4
( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2
( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.

Second Pass:
( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )
( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 )
Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.

Third Pass:
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )


Although the algorithm is simple, it is too slow and impractical for most problems even when compared to insertion sort.
Bubble sort can be practical if the input is in mostly sorted order with some out-of-order elements nearly in position.
*/
public class BubbleSort 
{

	public static void main(String[] args) 
	{
		int arr[] = { 36, 19, 26, 12, 5 };

		performSort(arr);
		printValues(arr);

	}

	private static void performSort(int arr[]) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			boolean swapFlag = false;
			for (int j = 0; j < arr.length - 1 - i; j++) 
			{
				if (arr[j] > arr[j + 1]) 
				{
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapFlag = true;
				}
			}
			if (!swapFlag)
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
