package arrays_and_strings;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        // create int numsLength to equal nums.length
        // create ArrayList res to store results
        // create int i = 0 to track current index
        // create while loop that runs while i < numsLength
        // start = nums[i]
        // create while loop that runs while i < numsLength - 1 and nums[i] + 1 == nums[i + 1]
        // i++
        // if start == nums[i]:
        // add to res start as string
        // else
        // add to res start as string + "->" + nums[i] as string
        // i++

        // return res
        int numsLength = nums.length;
        ArrayList<String> res = new ArrayList<>();
        int i = 0;

        while (i < numsLength) {
            int start = nums[i];
            while (i < numsLength - 1 && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            if (start == nums[i]) {
                res.add(Integer.toString(start));
            } else {
                res.add(Integer.toString(start) + "->" + Integer.toString(nums[i]));
            }
            i++;
        }
        return res;
    }
}
