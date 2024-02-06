import java.util.Scanner;
import java.util.*;

//take two variable curr and max add every elemt in curr till curr>=0 ,if it reaches -ve make it arr[i]..
//after every iteration check if it curr is greater than max or not and update max.

public class maxSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int curr = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (curr >= 0) {
                curr += arr[i];
            } else
                curr = arr[i];

            if (max < curr) {
                max = curr;
            }
        }

        System.out.println(max);

    }
}
