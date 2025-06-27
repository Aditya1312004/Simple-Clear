class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> as = new HashMap<>();
        int n = nums.length;
        for(int i =0;i<n;i++){
            int co = target - nums[i];
            if(as.containsKey(co)){
                return new int[]{
                    as.get(co) , i
                    };
                
            }
            as.put(nums[i] , i);
        }
        return new int[] {};
    }
}