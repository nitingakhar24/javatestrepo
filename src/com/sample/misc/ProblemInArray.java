// find all pairs in array of integers whose sum equal given number java 

/**
 * Java Program to find pairs on integer array whose sum is equal to k
 * @author nitingakhar
 */

package com.sample.misc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ProblemInArray {
	public static void main(String args[]) {
		int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
		prettyPrint(numbers, 7);

	}

	/** * Utility method to print input and output for better explanation. */
	public static void prettyPrint(int[] givenArray, int givenSum) {
		System.out.println("Given array : " + Arrays.toString(givenArray));
		System.out.println("Given sum : " + givenSum);
		System.out.println("Integer numbers, whose sum is equal to value : " + givenSum);
		printPairs(givenArray, givenSum);
		printPair(givenArray, givenSum);
	}

	private static void printPairs(int[] givenArray, int givenSum) {

		if (givenArray.length < 2) {
			return;
		}
		Set<Integer> set = new HashSet<>(givenArray.length);
		for (int value : givenArray) {
			int target = givenSum - value;
			// if target number is not in set then add
			if (!set.contains(target)) {
				set.add(value);
			} else {
				System.out.printf("(%d, %d) %n", value, target);
			}
		}

	}

	private static void printPair(int[] givenArray, int givenSum) {
		for (int i = 0; i < givenArray.length; i++) {
			int firstNum = givenArray[i];
			for (int j = i + 1; j < givenArray.length; j++) {
				int secondNum = givenArray[j];
				if ((firstNum + secondNum) == givenSum) {
					System.out.printf("(%d, %d) %n", firstNum, secondNum);
				}
			}
		}
	}

}
