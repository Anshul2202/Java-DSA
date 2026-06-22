class Solution171 {
    public int titleToNumber(String columnTitle) {
        int val = 0;
        char chr = ' ';
        int uniVal = 0;
        int result = 0;
        
        for(int i = 0; i < columnTitle.length(); i++){
            val = (int) Math.pow(26 , columnTitle.length() - 1 - i);
            chr = columnTitle.charAt(i);
            uniVal = ((int) chr) - 64;

            result += val * uniVal;
        }

        return result;
    }
}