class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        boolean result = true;

        while(i < j){

            while(i < j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }

            while(j > i && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }

            if(s.charAt(i) == s.charAt(j)){
                result = true;
            } else{
                result = false;
                return result;
            }

            i++;
            j--;
        }

        return result;
    }
}