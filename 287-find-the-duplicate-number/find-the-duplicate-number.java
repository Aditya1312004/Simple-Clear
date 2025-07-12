class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> as =new HashSet<>();
        for(int n : nums){
            if(as.contains(n)){
                return n;
            }
            as.add(n);
        }
        return 0;
    }
}