class Solution {
   
    public int minEatingSpeed(int[] piles, int h) {
        //brute force- O(n * max number of bananas in a pile)
        //SC- O(1)
         int speed = 1;
        
        while (true) {
            long totalTime = 0;
            for (int pile : piles) {
                totalTime += (int) Math.ceil((double) pile / speed);
            }

            if (totalTime <= h) {
                return speed;
            }
            speed++;
        }
    }
}