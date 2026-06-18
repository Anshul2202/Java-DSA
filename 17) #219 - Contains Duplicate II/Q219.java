class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int x = 1;
        
        for(int i = 0; i < nums.length; i++){

            x = i + 1;

            for(int j = 0; j < k && x < nums.length; j++){

                if(nums[i] == nums[x]){
                    return true;
                }

                x++;
            }
        }

        return false;
    }
}