import java.util.*;

// Easy

class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {

        LinkedList<Character> list = new LinkedList<>();
        
        for(int i = 0; i < ransomNote.length(); i++){

            list.add(ransomNote.charAt(i));

        }

        for(int i = 0; i < magazine.length(); i++){
            list.remove(Character.valueOf(magazine.charAt(i)));
        }

        if(list.size() == 0){
            return true;
        } else{
            return false;
        }
    }
}