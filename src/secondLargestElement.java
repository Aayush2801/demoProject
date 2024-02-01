import java.util.Scanner;

public class secondLargestElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int lar = arr[0];
        int slar = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > lar) {
                slar = lar;
                lar = arr[i];
            } else if (arr[i] < lar && arr[i] > slar) {
                slar = arr[i];
            }
        }
        System.out.println(slar);
    }

}
