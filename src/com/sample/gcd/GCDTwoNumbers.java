package com.sample.gcd;

public class GCDTwoNumbers {

	public static void main(String[] args) {

		GCDTwoNumbers gcdTwoNumbers = new GCDTwoNumbers();
		int num1 = 54;
		int num2 = 24;
		System.out.println("GCD of given numbers " + num1 + " and " + num2 + " is " + gcdTwoNumbers.findGCD(num1, num2));
		System.out.println("LCM of given numbers " + num1 + " and " + num2 + " is " + gcdTwoNumbers.findLCM(num1, num2));

	}

	private int findGCD(int a, int b) {
		/*if (num2 == 0) {
			return num1;
		}
		return findGCD(num2, num1 % num2);*/

        // Everything divides 0  
        if (a == 0 || b == 0) 
           return 0; 
       
        // base case 
        if (a == b) 
            return a; 
       
        // a is greater 
        if (a > b) 
            return findGCD(a-b, b); 
        return findGCD(a, b-a); 
	}
	
	private int findLCM(int a, int b)
	{
		return a*b / findGCD(a,b);
	}

}
