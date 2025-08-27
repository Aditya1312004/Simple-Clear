class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> as = new ArrayList<>();
        backtrack(as,nums , new ArrayList<>()  , 0);
        return as;

    }
    void backtrack(List<List<Integer>> as , int[] nums , List<Integer> temp ,int start){
        if(as.contains(temp)) return;
        as.add(new ArrayList<>(temp) );
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(as,nums,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}