class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int n = nums.length;
        int high = n-1;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid] >= nums[low] ){
                ans = Math.min(ans , nums[low]);
                low=mid+1;
            }
            else{
                high = mid-1;
                ans = Math.min(ans,nums[mid]);

            }
        }
        return ans;
    }
}