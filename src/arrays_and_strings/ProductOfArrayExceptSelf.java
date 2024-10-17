package arrays_and_strings;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        // create res array w length equals to nums.length
        // create prefix array to track the product of all numbers before i in nums
        // create postfix array to track the product of all numbers after i in nums

        int numsLength = nums.length;
        int[] res = new int[numsLength];

        int prefix = 1;
        for (int i = 0; i < numsLength; i++) {
            res[i] = prefix;
            prefix *= nums[i];
        }

        int postfix = 1;
        for (int i = numsLength - 1; i >= 0; i--) {
            res[i] *= postfix;
            postfix *= nums[i];
        }

        return res;
    }}
