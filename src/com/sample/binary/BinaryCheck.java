package com.sample.binary;

public class BinaryCheck 
{
    public static void main(String[] args) 
	{
    	isBinaryOrNot(00);
    	isBinaryOrNot(11001);
    	isBinaryOrNot(210120);

	}
    
    private static void isBinaryOrNot(int number)
    {
    	int copyofNumber = number;
    	boolean binaryFlag = true;
    	while(copyofNumber != 0)
    	{
    		// get last digit of the input number
        	int temp = copyofNumber%10;
        	
        	if (temp > 1)
        	{
        		binaryFlag = false;
        		break;
        		
        	}
        	else 
        	{
        		// Removes last digit from the input number
        		copyofNumber = copyofNumber/10;
        		binaryFlag = true;
        	}
    	}
    	if(binaryFlag)
    	{
    		System.out.println("Input number " + number + " is binary number");
    	}
    	else
    	{
    		System.out.println("Input number " + number + " is NOT a binary number");
    	}
    	
    }
}
