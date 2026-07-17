class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //brute force
        //TC = O(n^2), SC = O(n)
        /*
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
        return res;*/
        int[] res = new int[temperatures.length];
        Stack<int[]> stackRes = new Stack<>(); //pair: [temp, ind]
        
        for(int i = 0; i < temperatures.length; i++){
            int t = temperatures[i];
            while(!stackRes.isEmpty() && t > stackRes.peek()[0]){
                int[] pair = stackRes.pop();
                res[pair[1]] = i - pair[1];
            }
            stackRes.push(new int[]{t, i});
        }
        return res;
    }
}
