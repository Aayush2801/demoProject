package binarySearch;

import java.util.Scanner;

public class peakElement {

    // peak element is a element which is greater than both left and right.
    // first and last ele is always greater than -1 and n+1 index.

    // approach- check the first and last ele from second and second last if they
    // are greater simply return
    // else do binary search find mid and check mid-1 <mid >mid+1..else decide which
    // way to go..
    // that can be determined by checking if mid is on upward slope or downward
    // slope upward means peak in on the right of mid
    // and downward slope means peak is left of mid
    // move start and end respectively ..start and end pointer should be initialized
    // from 1st and n-2 index. to avoid out of bound
    // and also 1st and last are already been checked.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n == 0 && n == 1) {
            System.out.println("0");
        }

        if (arr[0] > arr[1]) {
            System.out.print(0);
        } else if (arr[n - 1] > arr[n - 2]) {
            System.out.println(n - 1);
        } else {
            int start = 1;
            int end = n - 2;

            while (start <= end) {
                int mid = (start + end) / 2;

                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    System.out.println(mid);
                    break;
                } else if (arr[mid] > arr[mid - 1]) {
                    start = mid + 1;
                } else
                    end = mid - 1;
            }

        }

    }
}
