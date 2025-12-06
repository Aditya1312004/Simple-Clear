class Solution {
    public int countPartitions(int[] nums) {
        int j =0;
        int sum1 = 0;
        int finalsum = 0;
        for(int i=0;i<nums.length;i++){
            finalsum += nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
             sum1 += nums[i];
            int sum2 = finalsum - sum1;

            if((sum1 - sum2) % 2 == 0){
                j++;
            }
        }
        return j;
    }
}