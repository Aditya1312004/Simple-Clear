class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0 ;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max , nums[i]);
        }
        int s = 0;
        int l = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == max){
                s++;
                l = Math.max(l , s);
            }
            else{
                s = 0;
            }
        }
        return l;
    }
}