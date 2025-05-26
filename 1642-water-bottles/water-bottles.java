class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drunk = numBottles;
        int empty = numBottles;
        while(empty >= numExchange){
            int newbottles = empty/numExchange;
             drunk += newbottles;
            empty  = empty % numExchange + newbottles;
        }
        return drunk;
    }
}