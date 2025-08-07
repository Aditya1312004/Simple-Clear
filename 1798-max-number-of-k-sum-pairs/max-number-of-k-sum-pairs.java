class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer , Integer> as =new HashMap<>();
        int count = 0;
        for(int num : nums){
            int diff= k - num;
            if(as.getOrDefault(diff , 0) > 0 ){
                count++;
                as.put(diff ,as.get(diff)-1);
            }
            else{
                as.put(num , as.getOrDefault(num , 0)+1);
            }
        }
        return count;
    }
}