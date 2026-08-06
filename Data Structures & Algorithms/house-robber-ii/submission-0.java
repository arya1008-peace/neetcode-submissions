class Solution {
    public int rob(int[] nums) {
        return Math.max(nums[0],                        Math.max(helper(Arrays.copyOfRange(nums,0, nums.length - 1)), 
        helper(Arrays.copyOfRange(nums, 1, nums.length))));
                      

    }
    static int helper(int[] nums){
        int rob1 = 0;
        int rob2 = 0;
        int temp;

        for(int num: nums){
            temp = Math.max(num + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
}
