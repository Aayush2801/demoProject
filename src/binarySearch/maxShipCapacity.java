package binarySearch;

import java.util.Scanner;

// given will be wigths of packages and D-no.of days...you need to find the minimum cap of ship to ship all packages within D days.

// apprach - Binary search in answers .. low will be the highest weight .. and high will be sum of all weights.

// create a function where you pass (arr, mid(cap))..and check if that capacity is able to do it in D days, if arr[i] is within cap
// add to arr[i] load variable if load exceeds cap increase day by one and make load as arr[i].

public class maxShipCapacity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int day = sc.nextInt();

        int low = Integer.MIN_VALUE;
        int high = 0;

        for (int i = 0; i < n; i++) {
            if (low < arr[i]) {
                low = arr[i];
            }
            high += arr[i];
        }
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            int NoOfDays = fun(arr, mid);

            if (NoOfDays <= day) {
                ans = mid;
                high = mid - 1;

            } else
                low = mid + 1;

        }
        System.out.println(ans);

    }

    static int fun(int[] arr, int cap) {
        int days = 1;
        int load = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + load > cap) {
                days += 1;
                load = arr[i];
            } else {
                load += arr[i];
            }
        }
        return days;
    }

}
