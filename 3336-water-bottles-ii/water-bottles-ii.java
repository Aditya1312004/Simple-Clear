class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int res = numBottles;
        int a = numBottles;
        while(a>= numExchange){
           res++;
           a = a - numExchange +1;
           numExchange++;
        }
        return res;
    }
}