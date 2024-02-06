import java.util.Scanner;

// we know that we need too start from +ve number it is given ..alternate means indexs 0 2 4 . .  are for +ve and 1 3 5..are for -ve.
//we can use this info to fill the ans arr.if we have +ve numbe while iterating we fill at 0 idx and move pointer to 2 idx so on 
// for -ve we can do the same 1 then 3.

public class rearrangeNegativePositiveAlternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        int pidx = 0;
        int nidx = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans[pidx] = arr[i];
                pidx += 2;
            } else {
                ans[nidx] = arr[i];
                nidx += 2;
            }
        }

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
