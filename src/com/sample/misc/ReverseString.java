package com.sample.misc;

public class ReverseString {

	public static void main(String[] args) {

		ReverseString reverseString = new ReverseString();
		String inputString = "Nitin";
		System.out.println("Reverse of " + inputString + " is " + reverseString.reverseString(inputString));
		System.out.println(
				"Another way, Reverse of " + inputString + " is " + reverseString.reverseArrayAnother(inputString));

	}

	private String reverseString(String inputValue) {
		char[] inputArray = inputValue.toCharArray();
		String reversedString = "";
		for (int i = inputValue.length() - 1; i >= 0; i--) {
			reversedString = reversedString + inputArray[i];
		}

		return reversedString;
	}

	private String reverseArrayAnother(String inputValue) {
		char[] inputArray = inputValue.toCharArray();

		int endIndex = inputArray.length - 1;

		char[] returnArray = new char[inputArray.length];

		for (int i = 0; i <= endIndex; i++) {
			returnArray[i] = inputArray[endIndex - i];
		}

		return new String(returnArray);

	}

}
