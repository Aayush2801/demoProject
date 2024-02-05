import java.util.Scanner;

public class numberThatAppearOnce {
    public static void main(String[] args) {
        // use xor ..xor with same number gives 0.and number xor with zero gives number.

        // all the pairs will be converted to zero and 0 xor number will give us the
        // number.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = 0;
        for (int i = 0; i < n; i++) {
            x = x ^ arr[i];
        }
        System.out.println(x);
    }
}
