class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> sorted = new HashMap<>();

        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sortedS = new String(arr);
            sorted.putIfAbsent(sortedS, new ArrayList<>());
            sorted.get(sortedS).add(s);
        }
        return new ArrayList<>(sorted.values());
    }
}
