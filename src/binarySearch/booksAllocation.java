package binarySearch;

import java.util.Scanner;

// leetcode 410

// binary search on answers concepts.
// basic bs keep low as ma in arr and high as sum of all elements.  create a function that takes (arr,mid,k) 
//and returns if that mid is possible or not...get to to the smallest mid possible.  th function returns true and flase for possible mid
// In functionn- add every elemnt till it reaches mid  ,then increase the count and make curr sum as arr[i].. at last check if count is
// smaller then k or not.

public class booksAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int low = Integer.MIN_VALUE;
        int high = 0;

        for (int i = 0; i < arr.length; i++) {
            high += arr[i];
            if (low < arr[i]) {
                low = arr[i];
            }
        }
        int ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            boolean isPos = fun(arr, k, mid);
            if (isPos == true) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;

        }
        System.out.println(ans);

    }

    static boolean fun(int[] nums, int k, int cap) {
        int count = 1;
        int curr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (curr + nums[i] <= cap) {
                curr += nums[i];
            } else {
                curr = nums[i];
                count++;
            }
        }
        if (count > k) {
            return false;
        }
        return true;
    }
}
