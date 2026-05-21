// Easy

class Solution {
    public int[] runningSum(int[] nums) {
        int[] output = new int[nums.length];
        int val = 0;

        for(int i = 0; i < nums.length ; i++){
            val += nums[i];
            output[i] = val;
        }

        return output;
    }
    
}