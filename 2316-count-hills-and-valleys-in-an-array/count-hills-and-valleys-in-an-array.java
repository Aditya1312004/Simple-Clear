class Solution {
    public int countHillValley(int[] nums) {
        
        int valley = 0;
        int hill = 0;
        int result = 0;
        for(int i=1;i<nums.length-1;i++){
        int left = i-1;
        int right = i+1;
        
        while(left>=0 && nums[left] == nums[i]){
            left--;
        }
        while(right <nums.length && nums[right] == nums[i] ){
            right++;
        }
            if(left>= 0 && right <nums.length&& nums[i] > nums[left] && nums[i] > nums[right]){
                hill++;
            }
            else if(left>=0 && right <nums.length && nums[i] <nums[left] && nums[i] < nums[right]){
                valley++;
            }
           while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
    i++;
}

        }
        result = valley+hill;
        return result;
    }
}