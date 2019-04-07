package com.sample.misc;

import java.util.ArrayList;
import java.util.List;

public class PrintOddNumbers 
{
	
	public static void main(String[] args) 
	{
		PrintOddNumbers printOddNumbers = new PrintOddNumbers();
		System.out.println("Odd numbers between" + printOddNumbers.oddNumbers(3, 9));
	}
	
	private List<Integer> oddNumbers(int l, int r) 
	{
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = l; i <= r; i++)
		{
			if(i%2 != 0)
			{
				list.add(i);
			}
		}
		return list;
		
	}

}
