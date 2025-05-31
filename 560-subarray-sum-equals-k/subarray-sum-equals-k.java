class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> as = new HashMap<>();
        int n = nums.length;
        int prefixsum=0;
        int count = 0;
        as.put(0,1);
        for(int i=0;i<n;i++){
            prefixsum += nums[i];
            int remove = prefixsum - k;

            count += as.getOrDefault(remove,0);
            as.put(prefixsum,as.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
}