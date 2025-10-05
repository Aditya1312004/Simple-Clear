class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }
        HashMap<Integer , Integer> as = new HashMap<>();
        as.put(0,-1);
        int sum =0;
        int length = 0;
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
            if(as.containsKey(sum)){
                length = Math.max(length , i-as.get(sum));
            }
            else{
                as.put(sum , i);
            }
        }
        return length;
    }
}