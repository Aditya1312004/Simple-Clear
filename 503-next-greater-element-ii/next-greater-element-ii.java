class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int result[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i] = -1;
            for(int j = 1;j<nums.length;j++){
                int b = (i+j)%nums.length;
                if(nums[b] > nums[i]){
                    result[i] = nums[b];
                    break;
                }
            }
            
        }
        return result;
    }
}