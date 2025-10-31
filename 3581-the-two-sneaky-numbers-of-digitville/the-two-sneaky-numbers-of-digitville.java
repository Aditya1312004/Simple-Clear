class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] as = new int[2];
        ArrayList<Integer> oi = new ArrayList<>();
        HashSet<Integer> po = new HashSet<>();
        

        for(int i=0;i<nums.length;i++){
            if(po.contains(nums[i])){
                oi.add(nums[i]);
            }
            else{
                po.add(nums[i]);
                
            }
        }

        for(int i=0;i<oi.size();i++){
            as[i] = oi.get(i);
        }
        return as;
    }
}