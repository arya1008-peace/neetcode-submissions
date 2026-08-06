class Solution {
    public int rob(int[] nums) {
        int rob1 = 0;//to find best till i - 2
        int rob2 = 0;//to find best till i - 1
        int temp;
        for(int num : nums){
            temp = Math.max(num + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;

        }
        return rob2;
    }
}
