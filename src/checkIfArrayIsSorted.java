import java.util.Scanner;

public class checkIfArrayIsSorted {
    // iterate and check if previous is smalller than curr
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                System.out.println("not Sorted");
                flag = true;
                break;
            }
        }
        if (flag == false)
            System.out.println("Sorted");
    }
}
