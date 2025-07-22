class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> as = new HashSet<>();
        int right = 0;
        int left = 0;
        int sum = 0;
        int max = 0;

        while(right < nums.length){
            
            if(!as.contains(nums[right])){
                as.add(nums[right]);
                sum += nums[right];
                max = Math.max(max , sum);
                right++;
            }
            else{
                as.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }
        return max;
    }
}