class Solution258 {
    public int addDigits(int num) {
        int temp = num;
        int val = 0;
        boolean condition = true;

        while(temp > 9){

            condition = true;
            
            while(condition){
                val += temp % 10;
                temp /= 10;

                if(temp == 0){
                    condition = false;
                    temp = val;
                    val = 0;
                }
            }

        }

        return temp;

        
    }
}