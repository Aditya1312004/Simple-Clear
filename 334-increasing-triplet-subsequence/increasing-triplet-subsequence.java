class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int i = 0;
        while(i < nums.length){
            if(nums[i] <= first){
                first = nums[i];
            }
            else if(second >= nums[i]){
                second = nums[i];
            }
            else{
                return true;
            }
            i++;
        }
        return false;
    }
}