class Solution {
    private int abc(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int l = 0, count = 0;
        for (int r = 0; r < n; r++) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            while (map.size() > k) {
                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }
                l++;
            }
            count += r - l + 1;
        }
        return count;
    }    
    public int subarraysWithKDistinct(int[] nums, int k) {
       return abc(nums, k)-abc(nums, k-1);
    }
}