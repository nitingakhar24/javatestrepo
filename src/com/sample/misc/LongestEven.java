package com.sample.misc;

public class LongestEven {
	
	public static void main(String[] args) {
		String inputString = "Today is a good and nice day";
		LongestEven longestEven = new LongestEven();
		longestEven.getLongestEvenWord(inputString);
	}
	
	private void getLongestEvenWord(String inputString)
	{
		
		String[] inputStringArr = inputString.split(" ");
		String longestEvenWord = "";
		for(String input : inputStringArr)
		{
			int inputWordLength = input.length();
			if((inputWordLength % 2 == 0) && (inputWordLength > longestEvenWord.length()))
			{
				longestEvenWord = input;
			}
		}
		System.out.println("Longest even and first occurence word is : " + longestEvenWord);
		
	}

}
