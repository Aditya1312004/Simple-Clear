class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        List<Integer> as = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            as.add(nums[i]);
            if(as.size() >k){
                as.remove(Collections.min(as));
            }
        }
        int[] res = new int[k];
        for(int j=0;j<as.size();j++){
            res[j] = as.get(j);
        }
             return res;
        
    }
}