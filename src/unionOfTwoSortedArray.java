import java.util.ArrayList;
import java.util.Scanner;

//take two pointer i and j. create a new arraylist tostore the ans,which ever is smamller add that in list .before adding check if the
// last element in the lsit is same as elemnt to be added if yed, dont add and incremen the pointer
//.atlast which ever is arry is left add all the elemnt of that array

public class unionOfTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int i = 0;
        int j = 0;
        ArrayList<Integer> al = new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (al.size() == 0 || al.get(al.size() - 1) != arr1[i]) {
                    al.add(arr1[i]);
                }
                i++;
            } else {

                if (al.size() == 0 || al.get(al.size() - 1) != arr2[j]) {
                    al.add(arr2[j]);
                }
                j++;

            }
        }

        while (i < n) {
            if (al.size() == 0 || al.get(al.size() - 1) != arr1[i]) {
                al.add(arr1[i]);
            }
            i++;
        }
        while (j < m) {
            if (al.size() == 0 || al.get(al.size() - 1) != arr2[j]) {
                al.add(arr2[j]);
            }
            j++;

        }

        for (Integer integer : al) {
            System.out.print(integer + " ");
        }
    }
}
