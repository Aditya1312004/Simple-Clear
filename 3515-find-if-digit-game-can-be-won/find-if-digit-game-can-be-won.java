class Solution {
    public boolean canAliceWin(int[] nums) {
        int n= nums.length;
        int count1 = 0;
        int count2 =0;
        for(int i=0;i<n;i++){
            if(nums[i] < 10){
                count1 += nums[i];
            }
            else{
                count2 += nums[i];
            }
        }
        return count2!=count1;
    }
}