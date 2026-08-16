class Solution {
    public int characterReplacement(String s, int k) {
        HashMap <Character, Integer> freq = new HashMap<>();
        int l = 0, maxF = 0, res = 0;
        for(int r = 0; r < s.length(); r++){
            freq.put(s.charAt(r), freq.getOrDefault(s.charAt(r), 0) +1);
            maxF = Math.max(maxF, freq.get(s.charAt(r)));

            while((r - l + 1) - maxF > k){
                //chars we dont change = total chars - chars we change
                //shrink fromleft 
                freq.put(s.charAt(l), freq.get(s.charAt(l) - 1));
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
