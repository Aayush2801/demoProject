package binarySearch;

import java.util.Scanner;

// brute force is to update the first and last while iterating keep both first and last as-1.. update first when we find the first occcurance 
//and last evertime we get ele. 

//optimal will be 

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

    }
}
