package binarySearch;

import java.util.Scanner;

// brute force is to update the first and last while iterating keep both first and last as-1.. update first when we find the first occcurance 
//and last evertime we get ele. 

//optimal will be -  do two inary searches one for first ele and one for the last occurance.
//first -whenever we find the ele we move the end pointer to mid-1.to search if there are more same ele previous to the curr first.
//last -whenever we find the ele we move the start pointer to mid+1.to search if there are more same ele after to the curr last.

public class fisrstAndLastIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ele = sc.nextInt();

        // brute force line 21 - 32

        // int first = -1;
        // int last = -1;

        // for (int i = 0; i < n; i++) {
        // if (arr[i] == ele) {
        // if (first == -1) {
        // first = i;
        // }
        // last = i;
        // }
        // }
        // System.out.println("first : " + first + " last: " + last);

        int f = -1;
        int l = -1;

        int start = 0;
        int end = n - 1;

        // for first occurance;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == ele) {
                f = mid;
                end = mid - 1;
            } else if (arr[mid] > ele) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // for last occurance;

        start = 0;
        end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == ele) {
                l = mid;
                start = mid + 1;
            } else if (arr[mid] > ele) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println("first : " + f + " last : " + l);
    }
}
