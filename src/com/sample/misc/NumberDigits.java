// Count Number of Digits in an Integer

package com.sample.misc;

public class NumberDigits 
{
	public static void main(String[] args) 
	{
		int count = 0;
		int num = 3452;
		int originalNum = num;
		while(num != 0)
		{
			num /= 10;
			++count;
		}
		System.out.println("Number of digits in " + originalNum + " is " + count);
	}

}
