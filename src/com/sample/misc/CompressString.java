/*
 * I need to create a method that receives a String and also returns a String.
 * Ex input: AAABBBBCC
 * Ex output: 3A4B2C
 */
package com.sample.misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CompressString {

	public static void main(String[] args) 
	{

		CompressString compressString = new CompressString();
		String inputStr = "AAABBBBCCDDDEEEFFGGGGGGHHHHHJJJJIIIIIIIIKKA";
		System.out.println("Compressed String is : " + compressString.getCompString(inputStr));

	}

	private String getCompString(String inputString) {
		String output = "";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < inputString.length(); i++) {
			Character character = inputString.charAt(i);
			if (map.containsKey(character)) {
				map.put(character, map.get(character) + 1);
			} else {
				map.put(character, 1);
			}
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			output += entry.getValue() + "" + entry.getKey();
		}

		return output;
	}

}
