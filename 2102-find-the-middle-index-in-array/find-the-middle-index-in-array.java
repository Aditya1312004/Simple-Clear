class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        int totalsum = 0;
        for(int i=0;i<nums.length;i++){
            totalsum += nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            int rightsum = totalsum - sum - nums[i];

            if(sum == rightsum){
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}