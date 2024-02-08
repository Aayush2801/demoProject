import java.util.PriorityQueue;
import java.util.Scanner;

// put everthing in PQ .the pop the first ele and store in prev....inside a while loop pop and check if curr which is pop ele is
// curr=prev+1 , then increase the count update the prev and compare count with max.
// or prev==curr..do nothing.
// or else make count to 1 again.

public class LongestConsecutiveSequenceInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : arr) {
            pq.add(i);
        }

        int prev = pq.poll();
        int count = 1;
        int max = 1;
        int curr = -1;
        while (!pq.isEmpty()) {
            curr = pq.poll();

            if (curr == prev + 1) {
                prev = curr;
                count++;
                max = Math.max(max, count);
            } else if (curr == prev) {
                prev = curr;
            } else {
                count = 1;
                prev = curr;
            }

        }
        System.out.println(max);
    }
}
