import java.util.Scanner;

public class leftRotateByKElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        // // line 12- 16 is one way and line 20 -25 is other way....remove comment
        // accordingly
        // k = k % n;
        // // 1way -uses a temp array to store the first k element .
        // // bring forward the rest element,then add the element in temp to original
        // arr
        // rot(arr, k, n);
        // 2 way optimal way.
        // rorate the whole array.then rotate 0-k,then k+1 to n.
        reverse(arr, 0, n - 1);
        reverse(arr, k + 1, n - 1);
        reverse(arr, 0, k);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    // solution 1- uses extra space
    static void rot(int[] arr, int k, int n) {

        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }
        int j = 0;
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[j];
            j++;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    static void reverse(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;

        }
    }
}
