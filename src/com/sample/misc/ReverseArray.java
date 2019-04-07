package com.sample.misc;

import java.util.Arrays;

//Reverse an array

public class ReverseArray {
	public static void main(String[] args) {

		int[] arr = { 9, 7, 3, 2, 1, 0 };
		System.out.println(Arrays.toString(arr));
		System.out.println("after reversing");
		
		ReverseArray reverseArray = new ReverseArray();
		
		int[] newarr = reverseArray.reverseArray(arr);
		
		System.out.println(Arrays.toString(newarr));


	}

	
	private int[] reverseArray(int[] inputArray)
	{
		int[] arr = inputArray;
		int startIndex = 0;
		int endIndex = arr.length -1;
		
		while (startIndex <= endIndex)
		{
			int temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
			
			startIndex++;
			endIndex--;
		} 
		
		return arr;
	}
	
}
