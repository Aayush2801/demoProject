import java.util.Scanner;

public class MinInRotatedSortedarray {

    // min ele will be the ele which is the point of rotation ..ie where curr is
    // smaller than prev or next is smaller than curr

    // do binary search
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int prev = (mid + n - 1) % n;
            int next = (mid + 1) % n;

            if (arr[mid] < arr[prev]) {
                System.out.println(arr[mid]);
                break;
            } else if (arr[next] < arr[mid]) {
                System.out.println(arr[next]);
                break;
            } else if (arr[mid] >= arr[start]) {
                start = mid + 1;
            } else if (arr[mid] <= arr[end]) {
                end = mid - 1;
            }
        }
    }
}
