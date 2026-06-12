import java.util.*;

//Easy

class Solution242 {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }

        LinkedList<Character> list = new LinkedList<>();

        for(int i = 0; i < s.length(); i++){
            list.add(s.charAt(i));
        }

        for(int i = 0 ; i < t.length(); i++){
            list.remove(Character.valueOf(t.charAt(i)));
        }

        if(list.size() == 0){
            return true;
        } else {
            return false;
        }
    }
}