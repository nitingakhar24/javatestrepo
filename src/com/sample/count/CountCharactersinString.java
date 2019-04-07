package com.sample.count;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharactersinString {

	public static void main(String[] args) 
	{
		characterCount("JavaJj2EE");
		characterCount("Fresh Fish");
		characterCount("Utterly Better B utter");
	}

	private static void characterCount(String inputString) 
	{

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		char charArray[] = inputString.replaceAll("\\s", "").toCharArray();
		for (Character ch : charArray) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		
		System.out.println("For input string" + inputString);
		System.out.println("Characters count " + map);

	}

}
