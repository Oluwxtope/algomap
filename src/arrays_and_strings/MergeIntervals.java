package arrays_and_strings;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        // sort the intervals array in ascending order of the first element in each interval in intervals
        // loop through the intervals array, if intervals[i + 1][0] <= intervals[i][1] then combine intervals

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> res = new ArrayList<>();
        int intervalsLength = intervals.length;
        res.add(intervals[0]);
        int resSize = 1;

        for (int i = 1; i < intervalsLength; i++) {
            int lastResIndex = resSize - 1;
            if (intervals[i][0] <= res.get(lastResIndex)[1]) {
                res.get(lastResIndex)[1] = Math.max(res.get(lastResIndex)[1], intervals[i][1]);
            } else {
                res.add(intervals[i]);
                resSize += 1;
            }
        }
        return res.toArray(new int[res.size()][]);
    }}
