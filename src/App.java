public class App {
    public static void main(String[] args) throws Exception {
        // merge sort

        int arr[] = { 4, 6, 8, 2, 3, 7, 5 };
        int n = arr.length - 1;

        mergeSort(arr, 0, n);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void mergeSort(int arr[], int low, int high) {
        if (low == high)
            return;
        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[arr.length];

        int left = low;
        int right = mid + 1;
        int idx = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[idx] = arr[left];
                left++;
                idx++;
            } else {
                temp[idx] = arr[right];
                idx++;
                right++;
            }
        }
        while (left <= mid) {
            temp[idx] = arr[left];
            left++;
            idx++;
        }
        while (right <= high) {
            temp[idx] = arr[right];
            idx++;
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }
    }

}
