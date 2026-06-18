import java.util.*;

class Solution228 {
    public List<String> summaryRanges(int[] nums) {

        ArrayList<String> list = new ArrayList<>();

        if(nums.length == 0){
            return list;
        }

        int start = nums[0];
        int temp = start;
        int stop = 0;
        String result = "";

        boolean condition = false;

        for(int i = 0; i <= nums.length; i++){

            if(i == nums.length){

                if(start < nums[i - 1]){
                    stop = nums[i - 1];
                    result = start + "->" + stop;
                    list.add(result);
                    return list;
                } else{
                    result = start + "";
                    list.add(result);
                    return list;
                }
            }


            if(temp == nums[i]){
                temp++;
            } 
            else{
                stop = temp - 1;
                condition = true;

                if(start != stop){
                    result = start + "->" + stop;
                    list.add(result);
                } else{
                    result = "" + start;
                    list.add(result);
                }
            }

            
            if(condition){
                start = nums[i];
                temp = start + 1;
                condition = false;
            }
        }

        return list;
    }
}