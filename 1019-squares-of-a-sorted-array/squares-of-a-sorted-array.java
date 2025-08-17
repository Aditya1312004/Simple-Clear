class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int[] res = new int[nums.length];
        int pos = nums.length-1;

        while(left<=right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                res[pos] = nums[left] * nums[left];
                left++;
            }
            else{
                res[pos] = nums[right] * nums[right];
                right--;
            }
            pos--;
        }
        return res;
    }
}