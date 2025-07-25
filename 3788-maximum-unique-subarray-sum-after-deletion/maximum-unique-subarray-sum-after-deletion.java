class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums);
       
        int max = Integer.MIN_VALUE;
                for(int i=0;i<nums.length;i++){
        Set<Integer> as = new HashSet<>();
         int sum = 0;
            for(int j = i;j<nums.length;j++){

                if(!as.contains(nums[j])){
                    as.add(nums[j]);
                    sum += nums[j];
                    max = Math.max(max,sum);
                }
                
            }
        }
        return max;
    }
}