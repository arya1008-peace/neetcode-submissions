class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            //for odd length, compare center w center and expand 
            //outwards
            count += countPalindromes(s, i, i);
            //even length, compare center nw adjacent and expand
            count += countPalindromes(s, i, i + 1);
        }
        return count;
    }
    static int countPalindromes(String s, int l, int r){
        int count = 0;
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            count++;
            l--;
            r++;
        }
        return count;
    }
}
