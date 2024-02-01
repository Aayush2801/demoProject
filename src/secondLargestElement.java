import java.util.Scanner;

// keep two variable one for largest=arr[0] and another for 2nd largest =-1, when we get a new largest we 
// update the 2nd largest with the previous largest and if no. is not greater than lageest
//  we check if it is greater than 2nd largest and we update the 2nd largest 
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
