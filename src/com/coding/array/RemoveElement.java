package com.coding.array;

import java.util.Arrays;

public class RemoveElement {

    // Write a program to remove a specific element from an array, if not found, print a message the element is not found.

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6};
        int elementToBeRemoved = 3;
        if (!validateElementIsPresentInArray(originalArray, elementToBeRemoved)) {
            System.out.println("Element:" + elementToBeRemoved + " to be removed from array is not found");
        } else {
            int[] newArray = removeElementFromArray(originalArray, elementToBeRemoved);
            System.out.println("Elements in new array after removing : " + elementToBeRemoved);
            System.out.println(Arrays.toString(newArray));
        }

    }


    /**
     * Remove element by iterating through the array.
     * The logic store elements into a new array by iterating through the original array except for the element to be removed.
     *
     * @param originalArray
     * @param elementToBeRemoved
     * @return
     */
    private static int[] removeElementFromArray(int[] originalArray, int elementToBeRemoved) {
        int[] newArray = new int[originalArray.length - 1];
        int index = 0;
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != elementToBeRemoved) {
                newArray[index] = originalArray[i];
                index++;
            }
        }
        return newArray;
    }

    /**
     * Check if the element to be removed is present in the original array itself or not.
     *
     * @param originalArray
     * @param elementToBeRemoved
     * @return
     */

    private static boolean validateElementIsPresentInArray(int[] originalArray, int elementToBeRemoved) {
        boolean foundElementToBeRemoved = false;
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] == elementToBeRemoved) {
                foundElementToBeRemoved = true;
            }
        }
        return foundElementToBeRemoved;
    }
}
