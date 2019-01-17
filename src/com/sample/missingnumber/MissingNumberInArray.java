/*If n = 8, then array ‘a’ will have 7 elements in the range from 1 to 8. For example {1, 4, 5, 3, 7, 8, 6}. 
One number will be missing in ‘a’ (2 in this case). 
You have to find out that missing number.*/

//Step 1 : First we find out sum of ‘n’ numbers by using formula n*(n+1)/2.

//Step 2 : Then we will find sum of all elements of array ‘a’.

//Step 3 : Missing_Number = (Sum of 1 to ‘n’ numbers) – (Sum of elements of array ‘a’)

package com.sample.missingnumber;

public class MissingNumberInArray 
{
	
	public static void main(String[] args) 
	{
		int arr[] = {1, 4, 5, 3, 7, 8, 6};
		int sumOfNo = sumOfNumbers(8);
		int sumOfElements = sumOfElements(arr);
		System.out.println("Missing number in array "  + (sumOfNo - sumOfElements));
	}
	
	private static int sumOfNumbers(int n)
	{
		int sum = (n * (n+1) ) / 2;
		return sum;
	}
	
	private static int sumOfElements(int arr[])
	{
		int sum = 0;
		for(int i=0;i < arr.length;i++)
		{
			sum = sum + arr[i];
		}
		return sum;
	}
}
