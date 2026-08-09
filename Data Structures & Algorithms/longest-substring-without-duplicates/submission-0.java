class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int res = 0;
        Map<Character, Integer> firstAppe = new HashMap<>();

        for(int r = 0; r < s.length(); r++){
            if(firstAppe.containsKey(s.charAt(r))){
                l = Math.max(firstAppe.get(s.charAt(r)) + 1, l);
             
            }
            firstAppe.put(s.charAt(r), r);
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
