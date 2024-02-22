import java.util.Scanner;

public class searchIn2Dmatrix {

    // matric is sorted row wise ;
    // start from top right corner ..if it is smaller then target go dowmward ..and
    // if target is not equal to curr then go left.

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

        while (arr[i][j] < target && i < n - 1) {
            i++;
        }
        while (arr[i][j] != target && j > 0) {
            j--;
        }

        if (arr[i][j] == target) {
            System.out.println("found");
        } else
            System.out.println("NOT FOuND");

    }
}
