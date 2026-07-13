class Solution {
    public int maxArea(int[] heights) {
        //brute force, time complexity- O(n^2)
        /*int res = 0;
        for(int i = 0; i < heights.length; i++){
            for(int j = i + 1; j < heights.length; j++){
                int area = ((j - i) * Math.min(heights[i], heights[j]));
                res = Math.max(res, area);
            }
        }
        return res;*/

        //optimal solution, complexity = O(n)
        
        int l = 0;
        int r = heights.length - 1;
        int res = 0;
        while(l < r){
            int area = ((r - l) * Math.min(heights[l], heights[r]));
            res = Math.max(res, area);
            if(heights[l] <= heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return res;
    }
}
