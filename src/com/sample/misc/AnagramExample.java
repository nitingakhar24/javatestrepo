package com.sample.misc;

import java.util.Arrays;

public class AnagramExample {

	public static void main(String[] args) {

		AnagramExample anagramExample = new AnagramExample();
		String str1 = "recitals";
		String str2 = "articles";
		if (anagramExample.checkIfStringIsAnagram(str1, str2))
		{
			System.out.println("Strings are Anagrams");
		}
		else
		{
			System.out.println("Strings are not Anagrams");
		}

	}

	private boolean checkIfStringIsAnagram(String str1, String str2) 
	{
		if (str1.length() != str2.length())
		{
			return false;
		}
		
		char[] chArray1 = str1.toCharArray();
		char[] chArray2 = str2.toCharArray();
		
		Arrays.sort(chArray1);
		Arrays.sort(chArray2);

		if(Arrays.equals(chArray1, chArray2))
		{
			return true;
		}
		
		return false;

	}

}
