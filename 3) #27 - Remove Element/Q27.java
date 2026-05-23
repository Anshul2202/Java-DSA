// Easy

class Solution {
    public int removeElement(int[] nums, int val) {
        int a = 0;
        int k = 0;
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == val){
                continue;
            } else{
                nums[a] = nums[i];
                k++;
                a++;
            }
        }
        return k;
    }
}