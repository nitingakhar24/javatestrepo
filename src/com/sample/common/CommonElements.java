package com.sample.common;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {

	public static void main(String[] args) {
	
	   String[] inputArray1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
	    String[] inputArray2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
	    
	    Set<String> set = new HashSet<String>();

	    for(int i = 0; i < inputArray1.length; i++)
	    {
	    	for(int j = 0; j < inputArray2.length; j++)
	    	{
	    		if(inputArray1[i].equals(inputArray2[j]))
	    		{
	    			set.add(inputArray1[i]);
	    		}
	    	}
	    }
	    
	    System.out.println(set); 
	    
}
}
