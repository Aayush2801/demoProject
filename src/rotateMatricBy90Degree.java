import java.util.Scanner;

public class rotateMatricBy90Degree {

    // idea is to take the transpose of a matrix and them reverse each row of matrix
    // .

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

        // transpose ..leave the diagonal and swap the element [i][j] to [j][i].

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < m; j++) {
                swap(i, j, arr);
            }
        }

        // reverse each row;
        int l = 0;
        int h = n - 1;

        for (int i = 0; i < n; i++) {
            int temp = arr[i][l];
            arr[i][l] = arr[i][h];
            arr[i][h] = temp;
        }

        // print

        System.out.println("rotated matrix by 90 degree is : ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void swap(int i, int j, int[][] arr) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
}
