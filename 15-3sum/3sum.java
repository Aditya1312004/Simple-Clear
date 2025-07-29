class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            HashSet<Integer> po = new HashSet<>();
            for(int j = i+1;j<nums.length;j++){
                int tn = -1 *(nums[i] + nums[j]);
                if(po.contains(tn)){
                    List<Integer> a = new ArrayList<>();
                    a.add(nums[i]);
                    a.add(nums[j]);
                    a.add(tn);
                    Collections.sort(a);
                    if(set.contains(a)){
                        continue;
                    }
                    else{
                        ans.add(a);
                        set.add(a);
                    }
                }
                po.add(nums[j]);
            }
        }
        return ans;
    }
}