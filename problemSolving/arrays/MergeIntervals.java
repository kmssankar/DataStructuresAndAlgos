package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {

    }

    public static int[][] merge(int[][] intervals) {

        List<int[]> list = new ArrayList<>();
        if (intervals.length < 2) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int prevEnd = -1;
        int prevStart = 1;
        for (int i = 0; i <= intervals.length - 1; i++) {
            if(i == 0 ) {
                prevEnd = intervals[i][1];
                prevStart = intervals[i][0];
            }
            else{
                if(intervals[i][0] <= prevEnd) {
                    if(intervals[i][1] > prevEnd) {
                        prevEnd = intervals[i][1];
                    }
                }
                else{
                    int[] builtInterval = new int[]{prevStart, prevEnd};
                    list.add(builtInterval);
                    prevStart = intervals[i][0];
                    prevEnd = intervals[i][1];
                }
            }
        }

        int[] lastInterval =   new int[]{prevStart, prevEnd};
        list.add(lastInterval);

        return  list.toArray(new int[0][]);
    }
}
