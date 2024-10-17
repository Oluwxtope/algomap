package arrays_and_strings;

public class FindClosestNumberToZero {
    public int findClosestNumber(int[] nums) {
        int closestDist = Math.abs(nums[0]);
        int closestNum = nums[0];
        int lengthNums = nums.length;
        for (int i = 1; i < lengthNums; i++) {
            int dist = Math.abs(nums[i]);
            if (closestDist == dist) {
                closestNum = Math.max(closestNum, nums[i]);
            } else if (dist < closestDist) {
                closestDist = dist;
                closestNum = nums[i];
            }
        }
        return closestNum;
    }
}
