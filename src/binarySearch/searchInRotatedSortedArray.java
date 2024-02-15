package binarySearch;

import java.util.Scanner;

//naive approach -O(N) for linear search 
// Optimal Approach - Binary search 
// first find the point where the array is rotated from, that can be found by checking the place where current ele is smaller than 
// the prev ele ..because its sorted.ii.e[7,8,9,'1',2,3,4,5,6] when we find the point from whicht he array is rotated then we got two sorted array 
// perform binary search in both halves.
//rotation point can be found out by ..perfrom binary search () get the mid element then go to the non sorted part to 
//find the roation point..how to decide which is non sorted part is by checking mid ele by start and last ele  for sorted mid should be greater than start and smaller then end 

public class searchInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int start = 0;
        int end = n - 1;
        int rpoint = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            int prev = (mid + n - 1) % n;
            int next = (mid + 1) % n;

            if (arr[mid] < arr[prev]) {
                rpoint = mid;
                break;
            }
            if (arr[mid] > arr[next]) {
                rpoint = mid + 1;
                break;
            }

            else if (arr[mid] < arr[start]) {
                end = mid - 1;
            } else if (arr[mid] > arr[end]) {
                start = mid + 1;
            }
        }
        System.out.println(rpoint);
        // no rotation or n rotation
        if (rpoint == 0) {
            System.out.println(bsearch(arr, 0, n - 1, target));

        } else {
            int a1 = bsearch(arr, 0, rpoint - 1, target);
            int a2 = bsearch(arr, rpoint, n - 1, target);

            if (a1 > -1) {
                System.out.println(a1);
            }
            if (a2 > -1) {
                System.out.println(a2);
            }
        }
    }

    static int bsearch(int[] arr, int start, int end, int target) {

        // System.out.println("reached bsearch");
        // System.out.println(start + " " + end);
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }

        return -1;
    }
}
