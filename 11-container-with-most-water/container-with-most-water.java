class Solution {
    public int maxArea(int[] nums) {
        int max = 0;
        int right = nums.length -1;
        int left = 0;
        while(left<right){
            int length = right-left;
            int height = Math.min(nums[left] , nums[right]);
            int area = length * height;
            max= Math.max(max , area);
        
        if(nums[left] < nums[right]){
            left++;
        }
        else{
            right--;
        }
        }
        return max;
    }
}