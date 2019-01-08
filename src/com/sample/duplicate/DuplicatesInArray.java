package com.sample.duplicate;

public class DuplicatesInArray {
	public static void main(String[] args) {
		String[] strArray = { "xyz", "abc", "abc", "def", "mno", "xyz", "pqr", "xyz" };

		for (int i = 0; i < strArray.length; i++) {
			int count = 0;

			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i] == strArray[j]) {
					++count;
					strArray[j] = strArray[j] + j;
					if (count == 1)
						System.out.println("Duplicate Element is : " + strArray[i]);
				}
			}
		}
	}
}