import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("target : ");
        int target = sc.nextInt();

        // create a map with index and value ..if map contains target-nums[i] return
        // index else put ele in the map;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - arr[i])) {
                System.out.println(i + " " + map.get(target - arr[i]));
            }
            map.put(arr[i], i);
        }

    }
}
