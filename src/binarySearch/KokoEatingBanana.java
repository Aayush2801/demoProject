package binarySearch;
//Understand question from web

// this is a question on concepts of inary search on answer.

import java.util.Scanner;

// idea is to get the range of answer which is from 1 - max ele in arr.
//then do binary search on answer , get the mid compare it with the given hour if its a possible answer then try elimination the after 
//part and make end pointer to mid and again do untile we get the mini rate/hour.
//calculate the total time for an rate with the help of a function.

public class KokoEatingBanana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int hour = sc.nextInt();

        // finfd range by finding the max

        int end = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > end)
                end = arr[i];
        }

        int start = 1;
        int ans = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = (start + end) / 2;

            int totalHour = calcu(arr, mid);
            if (totalHour <= hour) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(ans);
    }

    static int calcu(int[] arr, int rate) {
        int time = 0;
        for (int i = 0; i < arr.length; i++) {
            time += Math.ceil((double) arr[i] / (double) rate);
        }

        return time;
    }
}
