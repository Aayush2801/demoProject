import java.util.Scanner;

public class sort0123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int low = 0;
        int high = n - 1;
        int idx = 0;

        while (idx <= high) {
            switch (a[idx]) {

                case 0: {
                    swap(idx, low, a);
                    idx++;
                    low++;
                    break;
                }
                case 1: {
                    idx++;
                    break;

                }
                case 2: {
                    swap(idx, high, a);
                    high--;
                    break;

                }

            }
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    static void swap(int aa, int b, int a[]) {

        int temp = a[aa];
        a[aa] = a[b];
        a[b] = temp;
    }

}
