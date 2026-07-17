class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //brute force
        int[] res = new int[temperatures.length];
        int count = 0;
        for(int i = 0; i < temperatures.length; i++){
            for(int j = i + 1; j < temperatures.length; j++){
                if(temperatures[j] > temperatures[i]){
                    count = j - i;
                    res[i] = count;
                    break;
                }
                
            }
        }
        return res;
    }
}
