class Solution {
    public int trap(int[] height) {
        //optimal sol Time- O(n), Space- O(1)
        if(height.length == 0 || height == null){
            return 0;
        }
        int l = 0;
        int maxL = height[l];
        int r = height.length - 1;
        int maxR = height[r];

        int res = 0;
        while(l < r){
            if(maxL < maxR){
                l++;
                maxL = Math.max(maxL, height[l]);
                res += maxL - height[l];
            }
            else{
                r--;
                maxR = Math.max(maxR, height[r]);
                res += maxR - height[r];
            }
        }
        return res;
    }
}
