import java.util.*;

class Solution202 {
    public boolean isHappy(int n) {

        boolean condition2 = true;
        int num = n;

        HashSet<Integer> set = new HashSet<>();
        set.add(num);

        ArrayList<Integer> arr = new ArrayList<>();

        while(condition2){
            arr = getInts(num);
            num = getSquareSum(arr);

            if(num == 1){
                return true;
            }

            if(!set.contains(num)){
                set.add(num);
            } else{
                condition2 = false;
            }
        }

        return false;
    }

    public static ArrayList<Integer> getInts(int temp){

        boolean condition = true;

        int val = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        while(condition){

            val = temp % 10;
            temp /= 10;

            arr.add(val);

            if(temp == 0){
                condition = false;
            }
        }

        return arr;
    }

    public static int getSquareSum(ArrayList<Integer> arr){
        int val = 0;

        for(int i : arr){
            val += i * i;
        }

        return val;
    }
}