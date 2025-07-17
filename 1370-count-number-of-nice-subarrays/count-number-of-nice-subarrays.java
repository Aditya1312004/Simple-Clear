class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int prefixsum = 0;
        int l =0;
        HashMap<Integer , Integer> as = new HashMap<>();
        as.put(0,1);
        int count = 0;
        for(int i=0;i<nums.length;i++){
            prefixsum += nums[i]% 2;
            if(as.containsKey(prefixsum - k)){
                count += as.get(prefixsum - k);
            }
            as.put(prefixsum , as.getOrDefault(prefixsum , 0)+1);
        }
        return count;
    }
}