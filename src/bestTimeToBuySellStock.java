import java.util.Scanner;

//iterate from front keep trace of the minimum ele and for every ele check if diff of min and curr is greater or not .
public class bestTimeToBuySellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int maxdiff = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            maxdiff = Math.max(maxdiff, arr[i] - min);

        }
        System.out.println(maxdiff);
    }
}
