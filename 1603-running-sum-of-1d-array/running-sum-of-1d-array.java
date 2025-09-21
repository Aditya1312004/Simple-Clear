class Solution {
    public int[] runningSum(int[] nums) {
        int[] po = new int[nums.length];
        if(nums.length ==0 )return new int[]{};
        po[0] = nums[0];
        int i=1;
        while( i<nums.length){
            po[i] = nums[i] + po[i-1];
            i++;
        }
        return po;
    }
    
}