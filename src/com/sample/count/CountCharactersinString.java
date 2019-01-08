package com.sample.count;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountCharactersinString {

	public static void main(String[] args) {
		countCharCount("JavaJ2EE");
		countCharCount("Fresh Fish");
		countCharCount("Utterly Better B utter");
	}

	private static void countCharCount(String inputString) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char charArray[] = inputString.replaceAll("\\s", "").toCharArray();
		for (Character ch : charArray) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		Set<Character> charsInString = map.keySet();
		System.out.println("Characters count in " + inputString);

		for (Character ch : charsInString) {
			System.out.println(ch + " : " + map.get(ch));

		}

	}

}
