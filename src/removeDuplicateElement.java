import java.util.Scanner;
// return no. of unique elemnts in array

// take two pointer i and j ,place i at first start j from second and check if arr[i] != arr[j] then i++ and arr[i]=arr[j].  
public class removeDuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println(i + 1);

    }
}
