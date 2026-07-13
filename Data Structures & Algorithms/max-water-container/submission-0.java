class Solution {
    public int maxArea(int[] heights) {
        //brute force, time complexity- O(n^2)
        int res = 0;
        for(int i = 0; i < heights.length; i++){
            for(int j = i + 1; j < heights.length; j++){
                int area = ((j - i) * Math.min(heights[i], heights[j]));
                res = Math.max(res, area);
            }
        }
        return res;
    }
}
