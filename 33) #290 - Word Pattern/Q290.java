import java.util.*;

class Solution290 {
    public boolean wordPattern(String pattern, String s) {

        String[] arr = s.split(" ");
        String word = "";
        char ch = ' ';
        HashMap<Character , String> map = new HashMap<>();

        if(pattern.length() != arr.length){
            return false;
        }

        for(int i = 0; i < arr.length; i++){
            word = arr[i];
            ch = pattern.charAt(i);

            if(map.containsKey(ch) && !map.get(ch).equals(word)){
                return false;
            }

            if(!map.containsKey(ch)){
                
                if(!map.containsValue(word)){
                    map.put(ch , word);
                }
                else{
                    return false;
                }
            }

        }

        return true;
    }
}