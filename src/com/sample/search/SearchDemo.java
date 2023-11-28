package com.sample.search;

public class SearchDemo {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 5, 6, 7, 8, 10, 11, 13, 16, 17, 19, 23};
        int target = 19;

        int indexValue = linearSearch(nums, target);
        int indexValue2 = binarySearch(nums, target);
        if (indexValue != -1) {
            System.out.println("Element found at index " + indexValue);
        } else {
            System.out.println("Element not found");
        }

    }

    private static int linearSearch(int nums[], int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps taken by linear search:" + steps);
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int nums[], int target) {
        //5, 7, 9, 11, 13
        //left
        int left = 0;
        int right = nums.length - 1;
        int steps = 0;
        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                System.out.println("Steps taken by Binary search:" + steps);
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Steps taken by Binary search:" + steps);
        return -1;
    }
}
