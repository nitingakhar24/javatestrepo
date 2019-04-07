package com.sample.misc;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		ReverseWordsInSentence reverseWordsInSentence = new ReverseWordsInSentence();
		String inputSentence = "Only the words in this sentence should be reveresed";
		System.out.println(reverseWordsInSentence.reverseWordsInSentence(inputSentence));
	}

	private String reverseWordsInSentence(String inputSentence) {
		String[] inputWords = inputSentence.trim().split(" ");
		StringBuilder reversedWords = new StringBuilder();

		for (int i = inputWords.length - 1; i >= 0; i--) {
			reversedWords.append(inputWords[i] + " ");
		}

		return reversedWords.toString();
	}

}
