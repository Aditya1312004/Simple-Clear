class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int count = 0;
        if(nums.length < 3){
            return 0;
        }

        for(int i=0;i<n;i++){
            for(int j=i;j<nums.length-2;j++){
           if(nums[j] - nums[j+1] == nums[j+1] - nums[j+2]){
            count++;
           }
           else{
            break;
           }
            }
           }
        
        return count;
    }
}