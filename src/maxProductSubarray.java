import java.util.Scanner;

// idea is to take prefix product ans=d suff profuct whenever we encounter a 0 
//i.e product becomes 0 we again atart the preffix and suff from 1 from thr next ele.
//we take the max of prefix or suff.

public class maxProductSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int pre = 1;
        int suff = 1;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (pre == 0) {
                pre = 1;
            }
            if (suff == 0) {
                suff = 1;
            }

            pre = pre * arr[i];
            suff = suff * arr[n - i - 1];

            ans = Math.max(ans, Math.max(pre, suff));
        }
        System.out.println(ans);

    }
}
