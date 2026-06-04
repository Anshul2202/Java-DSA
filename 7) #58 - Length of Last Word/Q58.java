// Easy

class Solution58 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int j = s.length() - 1;
        int count = 0;

        char val = s.charAt(j);

        while((val != ' ') && (j >= 0)){
            count++;
            j--;

            if(j >= 0){
                val = s.charAt(j);
            }
        }

        return (count);

       }
}