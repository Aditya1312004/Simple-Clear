class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer , Integer> as = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            as.put(nums[i] , as.getOrDefault(nums[i] , 0)+1);

        }
        int max = 0;
       for(int count    : as.values()){
        max = Math.max(max , count);
       }
    int result = 0;
       for(int count:as.values() ){
        if(count == max){
            result += count;
        }

       }
       return result;
    }
}