import java.util.ArrayList;
import java.util.Scanner;

// leaders in array are no which does not have ant greater number on the right .

//sol--start from the back make the last ele as a leader , and mark it is max ..
//while iterating from last as soon as we het a greater ele than max we add it to the leader lis t and update the max.

public class leadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[n - 1]);
        int max = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                ans.add(max);
            }
        }
        for (Integer integer : ans) {
            System.out.print(integer + " ");
        }
        // ans is reversed.
    }
}
