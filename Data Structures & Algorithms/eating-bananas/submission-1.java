class Solution {
   
    public int minEatingSpeed(int[] piles, int h) {
        //brute force- O(n * max number of bananas in a pile)
        //SC- O(1)
        /* int speed = 1;
        
        while (true) {
            long totalTime = 0;
            for (int pile : piles) {
                totalTime += (int) Math.ceil((double) pile / speed);
            }

            if (totalTime <= h) {
                return speed;
            }
            speed++;
        }*/
        int low = 1;//as min speed can be 1 only
        int high = Arrays.stream(piles).max().getAsInt();
        int res = high;

        while(low <= high){
            int mid = (low + high)/2;
            long totalTime = 0;
            for(int p : piles){
                totalTime += Math.ceil((double)p / mid);
            }
            if(totalTime <= h){
                res = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return res;    
    }
}