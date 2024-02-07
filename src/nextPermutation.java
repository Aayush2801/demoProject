import java.lang.reflect.Array;
import java.util.Scanner;

// idea is to find the first place from second last pos where arr[i]<arr[i+1]. mark thaat as indx and then swap with 
//the first greater number from the last idx ,then simply reverse the arr from idx+1 till n-1.

public class nextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int idx = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                idx = i;
                break;
            }
            // if this idx is -1; that means there is no such elemt i<i+1..i.e there wont be
            // ant next grater permutation.
            // so just return the reverse of arr i.e smallest permutation this is given in
            // qstn.
        }

        if (idx == -1) {
            reverse(0, n - 1, arr);
        } else {
            for (int i = n - 1; i > idx; i--) {
                if (arr[idx] < arr[i]) {
                    swap(idx, i, arr);
                    break;
                }
            }

            reverse(idx + 1, n - 1, arr);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void reverse(int start, int end, int[] arr) {
        while (start <= end) {
            swap(start, end, arr);
            start++;
            end--;
        }
    }

    static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
