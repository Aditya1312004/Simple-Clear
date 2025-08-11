class Solution {
    public int pivotIndex(int[] nums) {
  
       
        int sum = 0 ;
        int sum1 = 0;
        int rightsum = 0;
        for(int num : nums){
            sum1 += num;
        }
        for(int i = 0;i<nums.length ; i++){
          
             rightsum = sum1 - sum - nums[i];
            
            if(sum == rightsum){
                return i;
            }
              sum += nums[i];

        }
        return -1;
    }
}