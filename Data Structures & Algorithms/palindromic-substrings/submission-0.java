class Solution {
    public int countSubstrings(String s) {
        int startIndex = 0;
        int len = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            //odd length;
            int l = i; 
            int r = i;
            while(l >= 0 && r < s.length() && s.charAt(l) ==        
            s.charAt(r)){
                count++;
                l--;
                r++;
            }
            l = i; 
            r = i + 1;
           while(l >= 0 && r < s.length() && s.charAt(l) ==        
            s.charAt(r)){
                count++;
                l--;
                r++;
            }

        }
        return count;
    }
}
