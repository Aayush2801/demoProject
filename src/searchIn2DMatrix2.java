import java.util.Scanner;

public class searchIn2DMatrix2 {
    // leetcode Q. 240

    // Approach start from top right corner , if target is smaller than this shift
    // pointer to left
    // ,,if target is greater shift ponter down,,until target is found

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();

        int i = 0;
        int j = arr[0].length - 1;

        while (i < arr.length && j >= 0) {
            if (arr[i][j] == target) {
                System.out.println("FOUND");
                break;
            }

            else if (target < arr[i][j]) {
                j--;
            } else
                i++;

        }

        System.out.println(" NOT FOUND");

    }
}
