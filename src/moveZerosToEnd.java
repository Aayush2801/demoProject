import java.util.Scanner;

public class moveZerosToEnd {
    public static void main(String[] args) {
        // move 0 to last - keep two pointers. i simpli iterating and j will point to 0
        // always.whenever i is non 0 and j is 0 we swap and increment j to next 0.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int j = -1;

        // find the first zer0.
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) {
            System.out.println("All zeros are already at the last.");
        } else {
            for (int i = j + 1; i < n; i++) {
                if (arr[i] != 0) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }

            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    }
}
