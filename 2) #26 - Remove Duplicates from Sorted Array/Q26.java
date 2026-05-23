// Easy

class Solution {
    public int removeDuplicates(int[] nums) {

        int j = 0;
        int a = 0;
        int k = 0;

        for(int i = 0; i<nums.length; i++){
            
                a = nums[j];
                while(a == nums[j]){
                    j++;
                    if( j >= nums.length){
                        nums[i] = a;
                        k++;
                        return k;
                    }
                }
            
            if(j < nums.length){
                nums[i] = a;
                k++;
            } else{
                break;
            }
        }

        return k;
    }
}