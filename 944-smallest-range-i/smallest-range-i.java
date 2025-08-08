class Solution {
    public int smallestRangeI(int[] nums, int k) {
        if(nums.length == 1)return 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i] < min){
                min = nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }
        int ans1 = min+k;
        int ans2 = max-k;
        int ans = ans2-ans1;
    if(ans < 0)return 0;

     return ans;
    }
   
    
}