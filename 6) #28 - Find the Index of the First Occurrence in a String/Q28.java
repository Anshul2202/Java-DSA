class Solution28 {
    public int strStr(String haystack, String needle) {
        int j = 0;
        int k = 0;

        for(int i = 0; i < haystack.length(); i++){

            if(haystack.length() < needle.length()){
                return -1;
            }

            k = 0;
            j = i;

            while(haystack.charAt(j) == needle.charAt(k)){

            if(j < haystack.length() - 1){
                j++;
            }
                k++;

                if(k == needle.length()){
                    return i;
                } else if(k > needle.length()){
                    continue;
                }
            }

        }

        return -1;

           
    }
}