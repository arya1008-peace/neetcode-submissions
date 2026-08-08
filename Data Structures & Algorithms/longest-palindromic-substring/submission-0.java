class Solution {
    public String longestPalindrome(String s) {
        int idx = 0, len = 0;
        for(int i = 0; i < s.length(); i++){
            int l = i, r = i;
            while(l >= 0 && r < s.length() && s.charAt(l) ==         
            s.charAt(r)){
                if(r - l + 1 > len){
                    idx = l;
                    len = r - l + 1;
                }
                l--;
                r++;
            }

            
            //even length
            l = i;
            r = i + 1;
            while(l >= 0 && r < s.length() && s.charAt(l) ==         
            s.charAt(r)){
                if(r - l + 1 > len){
                    idx = l;
                    len = r - l + 1;
                }
                l--;
                r++;
            }
        }
        return s.substring(idx, idx + len);
    }
}
