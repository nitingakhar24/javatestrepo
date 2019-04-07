package com.sample.misc;

public class Palindrome {
	public static void main(String[] args) {
		
		String input = "Nitin";
		Palindrome palindrome = new Palindrome();
		palindrome.checkInputStringIsPalidrome(input);
		

	}
	
	private void checkInputStringIsPalidrome(String inputString)
	{
		char[] inpCharArray = inputString.replace("\\s", "").toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i=inpCharArray.length-1;i >= 0;i--)
		{
			sb.append(inpCharArray[i]);
		}
		if (inputString.equalsIgnoreCase(sb.toString()))
		{
			System.out.println("Input String " + inputString + " is a Palindrome");
		} 
		else
		{
			System.out.println("Input String " + inputString + " is not a Palidrome");	
		}
	}
}
