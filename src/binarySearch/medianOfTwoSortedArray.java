package binarySearch;

import java.util.Scanner;

// important //

// Approach and Intiution.
// calculate total length after combining both arrays. partition in two half 'left and right'..in left take elements
//from first and last arrays if left contains 6 lement then check how many elemnt from rigth it should contain;
// calculate mid from le.... tooo complex ..see video on youtube

public class medianOfTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int n = n1 + n2;
        int left = (n1 + n2 + 1) / 2;

        int low = 0;
        int high = n1;

        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = left - mid1;

            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;

            if (mid1 < n1)
                r1 = arr1[mid1];
            if (mid2 < n2)
                r2 = arr2[mid2];

            if (mid1 - 1 >= 0)
                l1 = arr1[mid1 - 1];

            if (mid1 - 1 >= 0)
                l2 = arr2[mid2 - 1];

            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 1) {
                    System.out.println(Math.max(l1, l2));
                    break;
                } else {
                    System.out.println(((double) (Math.max(l1, l2)) + (Math.min(r1, r2))) / 2.0);
                    break;
                }
            } else if (l1 > r2) {
                high = mid1 - 1;
            } else
                low = mid1 + 1;

        }

    }
}
