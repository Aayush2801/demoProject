import java.util.HashMap;
import java.util.Scanner;

//Idea is to use prefix sum ..put 0,1 as first ele in map then while iterating check if prefix sum is current sum- k; 
//if yes the how manny are there ..then add the same in ans ..if not preseent in map then add the prefix sum in map;

public class CountSubarrayWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("k: ");
        int k = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (map.containsKey(sum - k)) {
                ans = ans + map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(ans);
    }
}
