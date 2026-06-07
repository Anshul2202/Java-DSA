// Easy

class Solution66 {
    public int[] plusOne(int[] digits) {
        int size = digits.length;

        int val1 = digits[size - 1]; 

        if(val1 != 9){
                val1 += 1;
                digits[size - 1] = val1;
                return digits;
            }

        int resSize = 0;
        
        for(int i = digits.length - 1; i >= 0; i--){

            if(digits[i] != 9){
              resSize = size;
                break;
            } else{
              resSize = size + 1;
            }     

        }

        int j = 1;
        int[] result = new int[resSize];

        for(int i = digits.length - 1; i >= 0; i--){

            int val2 = digits[i];

            if(val2 == 9){
                result[resSize - j] = 0;
                j++;
            } else{
                val2 += 1;
                result[resSize - j] = val2;
                
                for(int k = i - 1; k >= 0; k--){
                    result[k] = digits[k];
                }

                return result;
            }
        }

        if(resSize > size){
            result[0] = 1;
        }

        return result;
    }
}