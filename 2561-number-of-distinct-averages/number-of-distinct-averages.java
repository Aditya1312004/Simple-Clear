class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Double> yu = new HashSet<>();
        int left=0;
        int right = nums.length-1;
        while(left < right){
            double average  = (nums[left] + nums[right])/2.0;
            yu.add(average);
            left++;
            right--;
        }
     return yu.size();
    }
}