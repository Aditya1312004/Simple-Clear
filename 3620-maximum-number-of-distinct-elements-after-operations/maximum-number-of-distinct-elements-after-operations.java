class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int pre = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            int po = nums[i] - k;
            if(pre< po){
                pre = po;
                count++;
            }
            else if(pre < nums[i] + k ){
                pre = pre +1;
                count++;
            }
        }
        return count;
    }
}