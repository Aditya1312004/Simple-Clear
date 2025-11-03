class Solution {
    public int minCost(String colors, int[] neededTime) {
         int totalTime = 0;
        int j = 0;
        for(int i = 1; i < colors.length(); i++){
            if (colors.charAt(i) == colors.charAt(j)){
                if(neededTime[i] < neededTime[j]){
                    totalTime += neededTime[i];

                }else{
                    totalTime += neededTime[j];
                    j = i;
                }
            }else{
                j = i;
            }
            
            
        }
        return totalTime;
    }
}