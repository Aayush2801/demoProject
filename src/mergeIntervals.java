import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeIntervals {

    // the idea is to sor t the given intervals . according to the the first
    // ele[{1,2}{2,4}{3,6}] then do do the following
    // take two variable start=a[0][0] and end=a[0][1];
    // then iterate and check if the curr ele has first ele(start time) smaller then
    // the end..if yes ,then upadte the end by taking max among end and endtime of
    // the curr ele.
    // else..add the interval in ans ..and update the start and end time.with curr
    // start and end
    // don't forget to add the last {start,end}.

    public static void main(String[] args) {

        // only function
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int[] i : intervals) {

            if (i[0] <= end) {
                end = Math.max(end, i[1]);
            } else {
                res.add(new int[] { start, end });
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[] { start, end });
        return res.toArray(new int[0][]);
    }
}
