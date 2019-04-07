package com.sample.misc;

public class Factorial {

	public static void main(String[] args) {
		Factorial fact = new Factorial();
		System.out.println("The factorial of number using iteration " + fact.getFactorialOfNumber(5));

		System.out.println("The factorial of number using recursion " + fact.getFactorial(5));

	}

	private int getFactorialOfNumber(int number) {
		int result = 1;

		while (number > 1) {
			result = result * number;
			number--;
		}

		return result;
	}

	private int getFactorial(int number) {
		if (number == 0) {
			return 1;
		}
		return number * getFactorial(number - 1);
	}

}
